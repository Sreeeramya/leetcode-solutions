class Solution {
    public int coinChange(int[] coins, int amount) {
       int n=coins.length;
       int dp[][]=new int[n][amount+1];
       int ans=count(0,coins,amount,dp);
       if(ans!=Integer.MAX_VALUE){
          return ans;
       }
       return -1;
    }
    public int count(int idx,int coins[],int amount,int dp[][]){
             if(idx==coins.length){
                if(amount==0)return 0;
                else return Integer.MAX_VALUE;
             }
             if(dp[idx][amount]!=0)return dp[idx][amount];
             int skip=count(idx+1,coins,amount,dp);
             if(amount<coins[idx])return dp[idx][amount]=skip;
             int take=count(idx,coins,amount-coins[idx],dp);
             int pick=(take==Integer.MAX_VALUE)?take:take+1;
             return dp[idx][amount]=Math.min(pick,skip);
    }
}