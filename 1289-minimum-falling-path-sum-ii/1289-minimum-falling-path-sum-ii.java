class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min1=Integer.MAX_VALUE;
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int min=Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        min=Math.min(dp[i-1][k],min);
                    }
                }
                dp[i][j]=matrix[i][j]+min;
            }
        }
        for(int i=0;i<n;i++){
            min1=Math.min(min1,dp[m-1][i]);
        }
        return min1;
    }
}