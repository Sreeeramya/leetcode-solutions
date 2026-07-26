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
    public int pairSum(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode h2=s.next;
        s.next=null;
        int max=Integer.MIN_VALUE;
        h2=rev(h2);
        ListNode i=head;
        ListNode j=h2;
        while(j!=null){
            max=Math.max((i.val+j.val),max);
            i=i.next;
            j=j.next;
        }
        return max;
    }
}