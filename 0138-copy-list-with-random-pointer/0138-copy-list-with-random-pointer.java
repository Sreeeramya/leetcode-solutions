/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deep_copy(Node head){
        Node d=new Node(-1);
        Node t2=d;
        Node t1=head;
        while(t1!=null){
            t2.next=new Node(t1.val);
            t2=t2.next;
            t1=t1.next;
        }
        return d.next;
    }
    public void merge(Node head1,Node head2){
        Node d=new Node(-1);
        Node t=d;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null){
            t.next=temp1;
            temp1=temp1.next;
            t=t.next;

            t.next=temp2;
            temp2=temp2.next;
            t=t.next;

        }
    }
    public void random_conn(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.random!=null)temp2.random=temp1.random.next;
            else{
                temp2.random=null;
            }
            temp1=temp1.next.next;
            if(temp2.next!=null)temp2=temp1.next;
        }
    }
    public Node split(Node head){
        Node d1=new Node(-1);
        Node t1=d1;
        Node d2=new Node(-1);
        Node t2=d2;
        Node temp=head;
        while(temp!=null){
            t1.next=temp;
            temp=temp.next;
            t1=t1.next;

            t2.next=temp;
            temp=temp.next;
            t2=t2.next;
        }
        t1.next=null;
        return d2.next;
    }
    public Node copyRandomList(Node head) {
        Node head2=deep_copy(head);
        merge(head,head2);
        random_conn(head,head2);
        Node h2=split(head);
        return h2;
    }
}