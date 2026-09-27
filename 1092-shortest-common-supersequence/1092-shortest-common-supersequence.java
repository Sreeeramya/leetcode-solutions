class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))dp[i][j]=1+dp[i-1][j-1];
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder str=new StringBuilder();
        int i=m;
        int j=n;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                str.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>=dp[i][j-1]){
                    i--;
                }
                else j--;
            }
        }
        String ans=str.reverse().toString();
        int p=ans.length();
        int i1=0;
        int j1=0;
        int k1=0;
        String res="";
        while(k1<p){
            if(str1.charAt(i1)==ans.charAt(k1) && str2.charAt(j1)==ans.charAt(k1)){
                res+=str1.charAt(i1);
                i1++;
                j1++;
                k1++;
            }
            else{
                while(str1.charAt(i1)!=ans.charAt(k1)){
                    res+=str1.charAt(i1);
                    i1++;
                }
                while(str2.charAt(j1)!=ans.charAt(k1)){
                    res+=str2.charAt(j1);
                    j1++;
                }
            }
        }
        while(i1<m){
            res+=str1.charAt(i1);
            i1++;
        }
        while(j1<n){
            res+=str2.charAt(j1);
            j1++;
        }
        return res;
    }
}