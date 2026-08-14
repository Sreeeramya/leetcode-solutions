/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node cur=head;
        while(cur!=null){
            if(cur.child==null){
                cur=cur.next;
            }
            else{
                Node f=cur.next;
                Node c=flatten(cur.child);
                cur.child=null;
                cur.next=c;
                c.prev=cur;
                Node temp=c;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=f;
                if(f!=null)f.prev=temp;
                cur=f;
            }
        }

        return head;
    }
}