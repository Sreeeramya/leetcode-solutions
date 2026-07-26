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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(ListNode l:lists){
            ListNode temp=l;
            while(temp!=null){
                l1.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(l1);
        ListNode d=new ListNode(-1);
        ListNode t1=d;
        for(int a:l1){
            t1.next=new ListNode(a);
            t1=t1.next;
        }
        return d.next;
    }
}