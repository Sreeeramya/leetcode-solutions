class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int ans=0;
        int r_z[]=new int[m];
        int r_o[]=new int[m];
        int c_z[]=new int[n];
        int c_o[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    r_o[i]++;
                    c_o[j]++;
                }
                else if(mat[i][j]==0){
                    r_z[i]++;
                    c_z[j]++;
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