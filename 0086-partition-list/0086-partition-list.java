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
    public ListNode partition(ListNode head, int x) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode s=head;
        ListNode t1=d1;
        ListNode t2=d2;
        while(s!=null){
            if(s.val<x){
                t1.next=s;
                t1=s;
               
            }
            else{
                t2.next=s;
                t2=s;
              
            }
              s=s.next;
        }
        t2.next=null;
        t1.next=d2.next;
        return d1.next;
}
}