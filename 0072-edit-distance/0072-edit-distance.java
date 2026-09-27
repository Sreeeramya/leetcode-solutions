class Solution {
    public int minDistance(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
    }
    public int find(int i,int j,StringBuilder a,StringBuilder b,int dp[][]){
        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))return dp[i][j]=find(i-1,j-1,a,b,dp);
        else{
            int insert=1+find(i,j-1,a,b,dp);
            int remove=1+find(i-1,j,a,b,dp);
            int replace=1+find(i-1,j-1,a,b,dp);
            return dp[i][j]=Math.min(insert,Math.min(remove,replace));
        }
    }
}