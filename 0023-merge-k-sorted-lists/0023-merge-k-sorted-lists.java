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
        // ArrayList<Integer> l1=new ArrayList<>();
        // for(ListNode l:lists){
        //     ListNode temp=l;
        //     while(temp!=null){
        //         l1.add(temp.val);
        //         temp=temp.next;
        //     }
        // }
        // Collections.sort(l1);
        // ListNode d=new ListNode(-1);
        // ListNode t1=d;
        // for(int a:l1){
        //     t1.next=new ListNode(a);
        //     t1=t1.next;
        // }
        // return d.next;
        PriorityQueue<ListNode> p=new PriorityQueue<>(
            (a,b)-> a.val-b.val
        );
        for(ListNode h:lists){
            if(h!=null){
                p.offer(h);
            }
            
        }
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(!p.isEmpty()){
            ListNode val=p.poll();
            t.next=val;
            t=t.next;
            if(val.next!=null){
                p.offer(val.next);
            }
        }
        return d.next;
    }
}