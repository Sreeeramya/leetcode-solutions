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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> l1=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l1.add(temp);
            temp=temp.next;
        }
        int n=l1.size();
        int i=left-1;
        int j=right-1;
        while(i<j){
            ListNode t1=l1.get(i);
            ListNode t2=l1.get(j);
            l1.set(i,t2);
            l1.set(j,t1);
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            if(k==n-1){
                l1.get(k).next=null;
                break;
            }
            l1.get(k).next=l1.get(k+1);
        }
        return l1.get(0);
    }
}