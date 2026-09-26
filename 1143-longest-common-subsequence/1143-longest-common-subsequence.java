class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return LCS(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
    }
    public int LCS(int i,int j,StringBuilder a,StringBuilder b,int dp[][]){
        if(i<0 || j<0 )return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))return dp[i][j]=1+LCS(i-1,j-1,a,b,dp);
        else return dp[i][j]=Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
    }
}