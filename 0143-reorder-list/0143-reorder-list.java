/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rev(ListNode head){
        ListNode p=null;
        ListNode f=null;
        ListNode c=head;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode f=head;
        ListNode s=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode h2=s.next;
        s.next=null;
        h2=rev(h2);

        ListNode i=head;
        ListNode j=h2;
        ListNode t1=head;
        ListNode next1=null;
        ListNode next2=null;
        while(j!=null){
            next1=i.next;
            next2=j.next;
            i.next=j;
            i = i.next;
            i.next=next1;
            i=next1;
            j=next2;
        }
        
    }
}