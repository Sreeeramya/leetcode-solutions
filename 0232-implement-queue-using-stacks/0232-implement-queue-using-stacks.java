import java.util.Stack;
class MyQueue {
    Stack <Integer> f;
    Stack<Integer> s;
    public MyQueue() {
        f=new Stack<>();
        s=new Stack<>();
    }
    
    public void push(int x) {
        f.push(x);
    }
    
    public int pop(){
        while(!f.isEmpty()){
            s.push(f.pop());
        }
        int removed=s.pop();
        while(!s.isEmpty()){
            f.push(s.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!f.isEmpty()){
            s.push(f.pop());
        }
        int peeked=s.peek();
        while(!s.isEmpty()){
            f.push(s.pop());
        }
        return peeked;
    }
    
    public boolean empty(){
        return f.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */