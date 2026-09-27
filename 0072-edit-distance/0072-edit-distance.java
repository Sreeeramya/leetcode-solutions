class Solution {
    public int minDistance(String s1, String s2) {

        // by tabulation 
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))dp[i][j]=dp[i-1][j-1];
                else{
                    int insert=1+dp[i][j-1];
                    int remove=1+dp[i-1][j];
                    int replace=1+dp[i-1][j-1];
                    dp[i][j]=Math.min(insert,Math.min(remove,replace));
                }
            }
        }
        return dp[m][n];
        // int m=s1.length();
        // int n=s2.length();
        // int dp[][]=new int[m][n];
        // for(int i=0;i<m;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return find(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
    }
    // public int find(int i,int j,StringBuilder a,StringBuilder b,int dp[][]){
    //     if(i<0)return j+1;
    //     if(j<0)return i+1;
    //     // if(dp[i][j]!=-1)return dp[i][j];
    //     // if(a.charAt(i)==b.charAt(j))return dp[i][j]=find(i-1,j-1,a,b,dp);
    //     else{
    //         int insert=1+find(i,j-1,a,b,dp);
    //         int remove=1+find(i-1,j,a,b,dp);
    //         int replace=1+find(i-1,j-1,a,b,dp);
    //         return dp[i][j]=Math.min(insert,Math.min(remove,replace));
    //     }
    // }
}