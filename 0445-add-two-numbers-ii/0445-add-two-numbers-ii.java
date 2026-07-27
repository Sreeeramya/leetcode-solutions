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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
        return null;
    }
        ListNode t1=l1;
        ListNode t2=l2;
        t1=rev(l1);
        t2=rev(l2);
        ListNode d=new ListNode(-1);
        ListNode t=d;
        int c=0;
        while(t1!=null || t2!=null || c!=0){
            int sum=0;
            int x=0;
            int y=0;
            if(t1!=null){
               x=t1.val;
            }
            if(t2!=null){
               y=t2.val;
            }
            sum=c+x+y;
            ListNode ans=new ListNode(sum%10);
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
            t.next=ans;
            t=t.next;
            
        }
        ListNode f=rev(d.next);
        return f;
    }
}