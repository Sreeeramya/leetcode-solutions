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
    public ListNode reverse(ListNode head){
        ListNode c=head;
        ListNode p=null;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode h2=s.next;
        s.next=null;
        h2=reverse(h2);
        ListNode i=head;
        ListNode j=h2;
        while(j!=null){
            if(i.val!=j.val){
                return false;
            }
            i=i.next;
            j=j.next;
        }
        return true;
    }
    // public boolean isPalindrome(ListNode head) {
    //     ArrayList<Integer> a1=new ArrayList<>();
    //     ListNode temp=head;
    //     while(temp!=null){
    //         a1.add(temp.val);
    //         temp=temp.next;
    //     }
    //     int n=a1.size();
    //     int i=0;
    //     int j=n-1;
    //     while(i<j){
    //         if(a1.get(i)!=a1.get(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}