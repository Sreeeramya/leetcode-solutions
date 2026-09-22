class Solution {
    public int uniquePaths(int m, int n) {
        // int [][]dp=new int[m+1][n+1];
        // return find(m,n,dp);
        int [][]dp=new int[m][n];
        return tab(m,n,dp);
    }
    public int tab(int m,int n,int dp[][]){
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
    public int find(int m,int n,int dp[][]){
        if(m==1 || n==1)return 1;
        if(dp[m][n]!=0)return dp[m][n];
        dp[m][n]=find(m-1,n,dp)+find(m,n-1,dp);
        return dp[m][n];
    }
}