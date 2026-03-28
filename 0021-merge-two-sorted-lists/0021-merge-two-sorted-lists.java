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
    public ListNode insertLast(ListNode head,int value){
        ListNode n1=new ListNode(value);
        if(head==null){
            return n1;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f=list1;
        ListNode s=list2;
        ListNode ans=null;
        while(f!=null && s!=null){
            if(f.val<s.val){
                ans=insertLast(ans,f.val);
                f=f.next;
            }
            else{
                ans=insertLast(ans,s.val);
                s=s.next;
            }
        }
        while(f!=null){
            ans=insertLast(ans,f.val);
            f=f.next;
        }
        while(s!=null){
            ans=insertLast(ans,s.val);
            s=s.next;
        }
        return ans;
    }
}