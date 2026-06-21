class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int value) {
        s1.push(value);
        if(s2.size()==0 || value<=s2.peek()){
            s2.push(value);
        }
    }
    
    public void pop() {
        int ans=s1.pop();
        if(s2.peek()==ans){
            s2.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        if(s2.size()==0){
            return -1;
        }
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */