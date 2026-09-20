class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(find(0,arr),find(1,arr));
    }
    public int find(int i,int arr[]){
            if(i>=arr.length)return 0;
            if(dp[i]!=-1)return dp[i];
            int one_step=arr[i]+find(i+1,arr);
            int two_step=arr[i]+find(i+2,arr);
            dp[i]=Math.min(one_step,two_step);
            return dp[i];
    }
}

    