/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ||  head.next==null){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                break;
            }
        }
        if(f==null || f.next==null){
            return null;
        }
        ListNode b=head;
        while(b!=s){
            b=b.next;
            s=s.next;
        }
        return b;
    }
}