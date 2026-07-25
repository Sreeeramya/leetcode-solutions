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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        k%=length;
        if(k==0){
            return head;
        }
        ListNode dummy=null;
        ListNode d1=null;
        ListNode s=head;
        ListNode f=head;
        for(int i=0;i<k+1;i++){
            f=f.next;
        }
        while(f!=null){
            s=s.next;
            f=f.next;
        }
        ListNode a=s.next;
        s.next=null;
        ListNode tail=a;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return a;
    }
}