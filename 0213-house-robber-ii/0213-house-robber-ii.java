class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];
        if(n==2)return Math.max(arr[0],arr[1]);
        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<=n-2;i++){
            int take=arr[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        }
        int case1=dp[n-2];

        dp[1]=arr[1];
        dp[2]=Math.max(arr[1],arr[2]);
        for(int i=3;i<=n-1;i++){
            int take=arr[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        }
        int case2=dp[n-1];

        return Math.max(case1,case2);
    }
}