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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode s=head.next;
        ListNode prev=head;
        while(s!=null){
            if(prev.val==s.val){
                prev.next=s.next;
                s=s.next;
            }
            else{
                
                prev=s;
                s=s.next;
            }
            
        }
        return head;
    }
}