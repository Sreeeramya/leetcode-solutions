class Solution {
    int dp[];
    public int rob(int[] arr) {
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return find(0,arr);
    }
    public int find(int i,int arr[]){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int pick=arr[i]+find(i+2,arr);
        int skip=find(i+1,arr);
        dp[i]=Math.max(pick,skip);
        return dp[i];
    }
}