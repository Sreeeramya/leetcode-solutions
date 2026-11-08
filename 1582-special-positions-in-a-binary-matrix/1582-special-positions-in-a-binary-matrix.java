class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int ans=0;
        int r_o[]=new int[m];
        int c_o[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    r_o[i]++;
                    c_o[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && !(r_o[i]>1) && !(c_o[j]>1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}