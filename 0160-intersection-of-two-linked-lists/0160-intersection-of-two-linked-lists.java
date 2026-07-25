/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        int k=0;
        ListNode temp1=headA;
        ListNode  temp2=headB;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        
        ListNode f=headA;
        ListNode s=headB;
        if(l1>l2){
            k=l1-l2;
            for(int i=0;i<k;i++){
                f=f.next;
            }
            while(f!=s){
                f=f.next;
                s=s.next;
            }
            return f;
        }
        if(l2>l1){
            k=l2-l1;
            f=headB;
            s=headA;
            for(int i=0;i<k;i++){
                f=f.next;
            }
            
            while(f!=s){
                f=f.next;
                s=s.next;
            }
            return f;
        }
        if(l1==l2){
            f=headA;
            s=headB;
            while(f!=s){
                f=f.next;
                s=s.next;
            }
            return f;
        }
        return f;
    }
}