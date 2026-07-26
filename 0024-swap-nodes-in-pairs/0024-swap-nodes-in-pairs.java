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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode s=head;
        ListNode d1=new ListNode(-1);
        ListNode t1=d1;
        while(s!=null && s.next!=null){
            ListNode next_p=s.next.next;
            t1.next=s.next;
            t1=t1.next;
            t1.next=s;
            t1=t1.next;
            t1.next=next_p;
            s=next_p;
            
        }
        return d1.next;
    }
}