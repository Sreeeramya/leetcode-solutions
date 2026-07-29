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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head;
        ListNode curr=prev.next;
        while(curr!=null){
            int g=gcd(prev.val,curr.val);
            ListNode gc=new ListNode(g);
            prev.next=gc;
            gc.next=curr;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}