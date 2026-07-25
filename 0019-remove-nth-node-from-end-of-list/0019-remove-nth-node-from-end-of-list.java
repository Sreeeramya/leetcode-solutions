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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        ListNode prev=head;
        for(int i=0;i<n;i++){
            if(f==null){
                return null;
            }
            f=f.next;
        }
        if(f==null){
            return head.next;
        }
        while(f!=null){
            prev=s;
            s=s.next;
            f=f.next;
        }
        
        prev.next=s.next;
        return head;
    }
}