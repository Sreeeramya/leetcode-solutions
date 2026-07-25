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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode h2=s.next;
        s.next=null;
        head=sortList(head);
        h2=sortList(h2);
        return merge(head,h2);
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode i=head1;
        ListNode j=head2;
        ListNode d=new ListNode(-1);
        ListNode k=d;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next=i;
                k=i;
                i=i.next;
            }
            else{
                k.next=j;
                k=j;
                j=j.next;
            }
        }
        if(i==null){
            k.next=j;
        }
        else{
            k.next=i;
        }
        return d.next;
    }
}