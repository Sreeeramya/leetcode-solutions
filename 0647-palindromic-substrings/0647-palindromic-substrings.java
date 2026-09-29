class Solution {
    public int countSubstrings(String s1) {
        int n=s1.length();
        int count=0;
        int dp[][]=new int[n][n];
        int maxlen=0;
        for(int i=0;i<n;i++){
            int row=0;
            for(int col=i;col<n;col++){
                if(row==col){
                    dp[row][col]=1;
                    count++;
                }
                else if(s1.charAt(row)==s1.charAt(col)){
                if(col==row+1)dp[row][col]=2;
                else if(dp[row+1][col-1]!=0)dp[row][col]=2+dp[row+1][col-1];
                if(dp[row][col]>=2)count++;

                }
                row++;
            }
            
        }
    return count;
    }
}