class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int k=Math.min(m,n);k>=1;k--){
            for(int i=0;i<=m-k;i++){
                for(int j=0;j<=n-k;j++){
                    boolean valid=true;
                    int sum1=0;
                    for(int c=j;c<j+k;c++){
                        sum1+=grid[i][c];
                    }
                    for(int r=i+1;r<i+k;r++){
                        int r_sum=0;
                        for(int c=j;c<j+k;c++){
                            r_sum+=grid[r][c];
                        }
                        if(r_sum!=sum1){
                            valid=false;
                            break;
                        }
                    }
                    int t=sum1;
                    sum1=0;
                    for(int r=i;r<i+k;r++){
                        sum1+=grid[r][j];
                    }
                    for(int c=j+1;c<j+k;c++){
                        int c_sum=0;
                        for(int r=i;r<i+k;r++){
                            c_sum+=grid[r][c];
                        }
                        if(c_sum!=sum1){
                            valid=false;
                            break;
                        }
                    }
                    if(t!=sum1){
                        valid=false;
                    }
                    int d1=0;
                    int d2=0;
                    for(int v=0;v<k;v++){
                        d1+=grid[i+v][j+v];
                    }
                    for(int v=0;v<k;v++){
                        d2+=grid[i+v][j+k-1-v];
                    }
                    if(d1!=t || d2!=t){
                        valid=false;
                    }
                    if(valid)return k;
                }

            }
        }
        return 1;
    }
}