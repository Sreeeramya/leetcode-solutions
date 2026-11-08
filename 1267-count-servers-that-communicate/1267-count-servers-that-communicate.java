class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int row_c[]=new int[m];
        int col_c[]=new int[n];
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    row_c[i]++;
                    col_c[j]++;
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && (row_c[i]> 1 || col_c[j]>1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}