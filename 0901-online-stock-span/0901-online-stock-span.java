class Pair{
    int price;
    int span;
    public Pair(int price,int span){
        this.price=price;
        this.span=span;
    }
}
class StockSpanner {
    Stack<Pair> s1=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span=1;
        while(!s1.isEmpty() && s1.peek().price<=price){
            span+=s1.peek().span;
            s1.pop();
        }
        s1.push(new Pair(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */