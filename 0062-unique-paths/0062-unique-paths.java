class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m+1][n+1];
        return find(m,n,dp);
    }
    public int find(int m,int n,int dp[][]){
        if(m==1 || n==1)return 1;
        if(dp[m][n]!=0)return dp[m][n];
        dp[m][n]=find(m-1,n,dp)+find(m,n-1,dp);
        return dp[m][n];
    }
}