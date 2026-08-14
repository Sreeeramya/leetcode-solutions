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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[]ans=new int[2];
        ListNode a=head;
        ListNode b=a.next;
        ListNode c=b.next;
        int idx=1;
        int f_idx=-1;
        int l_idx=-1;
        int min_dist=Integer.MAX_VALUE;
        while(c!=null){
            if((b.val>a.val && b.val>c.val) ||(b.val<a.val && b.val<c.val)){
                if(f_idx==-1 && l_idx==-1){
                    f_idx=idx;
                    l_idx=idx;
                }
                else if(f_idx!=-1 && l_idx!=-1){
                    int dist=idx-l_idx;
                    if(dist<min_dist){
                        min_dist=dist;
                    }
                    l_idx=idx;
                }
            }
            a=b;
            b=c;
            c=c.next;
            idx++;
        }
        if(f_idx==-1 || f_idx==l_idx){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int max_dist=l_idx-f_idx;
        ans[0]=min_dist;
        ans[1]=max_dist;
        return ans;
    }
}