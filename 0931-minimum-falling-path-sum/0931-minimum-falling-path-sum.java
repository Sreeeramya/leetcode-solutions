class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            dp[i][0]=matrix[i][0]+Math.min(dp[i-1][0],dp[i-1][1]);
            for(int j=1;j<n-1;j++){
                    dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]));
            }
            dp[i][n-1]=matrix[i][n-1]+Math.min(dp[i-1][n-1],dp[i-1][n-2]);
        }
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[m-1][i]);
        }
        return min;
    }
}