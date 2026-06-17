class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            int profit=prices[i]-min;
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}