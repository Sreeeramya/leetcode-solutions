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
    public ListNode rev(ListNode left){
        ListNode p=null;
        ListNode f=null;
        ListNode c=left;
        while(c!=null){
        
        f=c.next;
        c.next=p;
        p=c;
        c=f;
        }
        
        return p;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
    //     if(head==null){
    //         return null;
    //     }
    //     ArrayList<ListNode> l1=new ArrayList<>();
    //     ListNode temp=head;
        
    //         while(temp!=null){
    //             l1.add(temp);
    //             temp=temp.next;
    //         }
        
        
    //     int i=left-1;
    //     int j=right-1;
    //     while(i<j){
    //         ListNode v1=l1.get(i);
    //         ListNode v2=l1.get(j);
    //         l1.set(i,v2);
    //         l1.set(j,v1);
    //         i++;
    //         j--;
    //     }
    //     int n=l1.size();
    //     for(int idx=0;idx<n;idx++){
    //         if(idx==n-1){
    //             l1.get(idx).next=null;
    //             break;
    //         }
    //         l1.get(idx).next=l1.get(idx+1);

    //     }
    //     return l1.get(0);
        ListNode temp=head;
        ListNode before=null;
        ListNode a=null;
        int c=1;
        while(c!=left){
            before=temp;
            temp=temp.next;
            c++;
        }
        a=temp;
        ListNode b=null;
        ListNode after_right=null;
        while(c!=right){
            temp=temp.next;
            c++;
        }
        b=temp;
        after_right=temp.next;
        b.next=null;
        ListNode r=rev(a);
        if(before==null){
            head=r;
        }
        else{
            before.next=r;
        
        }
        
        a.next=after_right;
        return head;
        
    }
    
}