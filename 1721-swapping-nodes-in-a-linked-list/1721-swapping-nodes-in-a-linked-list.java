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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode s=head;
        ListNode f1=head;
        for(int i=1;i<k;i++){
            f1=f1.next;
        }
        ListNode f2=head;
        for(int i=1;i<=k;i++){
            f2=f2.next;
        }
        while(f2!=null){
            s=s.next;
            f2=f2.next;
        }
        int temp=f1.val;
        f1.val=s.val;
        s.val=temp;
        return head;
    }
}