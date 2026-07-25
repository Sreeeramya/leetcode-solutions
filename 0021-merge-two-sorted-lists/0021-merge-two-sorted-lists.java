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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode d=new ListNode(-1);
        ListNode k=d;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next=i;
                k=i;
                i=i.next;
            }
            else{
                k.next=j;
                k=j;
                j=j.next;
            }
        }
        if(i==null){
            k.next=j;
        }
        else if(j==null){
            k.next=i;
        }
        return d.next;
    }
}