class Solution {
    public void set_row(int grid[][],int r,int c){
        for(int i=0;i<c;i++){
            grid[r][i]^=1;
        }
    }
    public void flip_col(int grid[][],int r,int j){
        for(int i=0;i<r;i++){
            grid[i][j]^=1;
        }
    }

    public int cal_ones(int grid[][],int r,int c){
        int c1=0;
            for(int j=0;j<r;j++){
                if(grid[j][c]==1){
                    c1++;
                }
            }
        
        return c1;
    }
    public int cal_score(int grid[][],int r,int c){
        int ans=0;
        for(int i=c-1;i>=0;i--){
                int po=1<<(c-i-1);
                int cal=cal_ones(grid,r,i);
                ans+=cal*po;
            }
        return ans;
    }
    public int matrixScore(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            if(grid[i][0]==0){
                set_row(grid,i,c);
            }
        }

        for(int j=1;j<c;j++){
        int c_zero=0;
        int c_one=0;
            for(int i=0;i<r;i++){
                if(grid[i][j]==0){
                    c_zero++;
                }
                else{
                    c_one++;
                }
            }
            if(c_zero>c_one){
                flip_col(grid,r,j);
            }
        }
        int score=cal_score(grid,r,c);
        return score;
    }
}