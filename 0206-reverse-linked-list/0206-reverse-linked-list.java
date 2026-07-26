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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ArrayList<ListNode> a1=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            a1.add(temp);
            temp=temp.next;
        }
        int n=a1.size();
        for(int i=n-1;i>=1;i--){
            a1.get(i).next=a1.get(i-1);
        }
        a1.get(0).next=null;
        return a1.get(n-1);
    }
}