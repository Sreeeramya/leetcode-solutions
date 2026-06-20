class Solution {
    public int[] finalPrices(int[] prices) {
        int j=0;
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
                    ans[j]=prices[i]-s1.peek();
                    s1.push(prices[i]);
                    i--;
                    j++;
                }
            }
            if(s1.isEmpty() || i==n-1 || i==n-2){
                ans[j]=prices[i];
                s1.push(prices[i]);
                i--;
                j++;
            }
        }
        int a=0;
        int b=ans.length-1;
        while(a<=b){
            int temp=ans[a];
            ans[a]=ans[b];
            ans[b]=temp;
            a++;
            b--;
        }
        return ans;
    }
}