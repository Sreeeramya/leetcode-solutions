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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        int c=0;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(t1!=null || t2!=null || c!=0){
            int x=0;
            int y=0;
            if(t1!=null){
                x=t1.val;
            }
            else if(t1==null){
                x=0;
            }
            if(t2!=null){
                y=t2.val;
            }
            else if(t2==null){
                y=0;
            }
            int sum=0;
            sum=c+x+y;
            ListNode v=new ListNode(sum%10);
            if(sum>9){
                c=1;
            }
            else{
                c=0;
            }
            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }
            
            t.next=v;
            t=t.next;
        }
        return d.next;
    }
}