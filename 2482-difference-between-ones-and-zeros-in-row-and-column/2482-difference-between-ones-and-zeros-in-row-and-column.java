class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int r_one[]=new int[m];
        int r_zero[]=new int[m];
        int c_one[]=new int[n];
        int c_zero[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    r_one[i]++;
                    c_one[j]++;
                }
                else if(grid[i][j]==0){
                    r_zero[i]++;
                    c_zero[j]++;
                }
            }
        }
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=r_one[i]+c_one[j]-r_zero[i]-c_zero[j];
            }
        }
        return ans;
    }
}