class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        Stack<Integer> s1=new Stack<>();
        int n=prices.length;
        int i=n-1;
        while(i>=0){
            if(!s1.isEmpty()){
                while(!s1.isEmpty() && !(s1.peek()<=prices[i])){
                    s1.pop();
                }
                if(!s1.isEmpty() && s1.peek()<=prices[i]){
                    ans[i]=prices[i]-s1.peek();
                    s1.push(prices[i]);
                    i--;
                    
                }
            }
            if(s1.isEmpty() || i==n-1 || i==n-2){
                ans[i]=prices[i];
                s1.push(prices[i]);
                i--;
                
            }
        }
        return ans;
    }
}