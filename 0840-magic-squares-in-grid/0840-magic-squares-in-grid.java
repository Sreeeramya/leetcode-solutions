class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                boolean valid=true;
                boolean arr[]=new boolean[10];
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        int a=grid[r][c];
                        if(a<1 || a>9 || arr[a]){
                            valid=false;
                            break;
                        }
                        arr[a]=true;
                    }
                    if(!valid)break;
                }
                int sum=0;
                for(int c=j;c<j+3;c++){
                    sum+=grid[i][c];
                }
                for(int r=i+1;r<i+3;r++){
                    int r_sum=0;
                    for(int c=j;c<j+3;c++){
                        r_sum+=grid[r][c];
                    }
                    if(r_sum!=sum){
                        valid=false;
                        break;
                    }
                }
                sum=0;
                for(int r=i;r<i+3;r++){
                    sum+=grid[r][j];
                }
                for(int c=j+1;c<j+3;c++){
                    int c_sum=0;
                    for(int r=i;r<i+3;r++){
                        c_sum+=grid[r][c];
                    }
                    if(c_sum!=sum){
                        valid=false;
                        break;
                    }
                }
                int d1=0;
                int d2=0;
                for(int k=0;k<3;k++){
                    d1+=grid[i+k][j+k];
                }
                for(int k=0;k<3;k++){
                    d2+=grid[i+k][j+2-k];
                }
                if(d1!=d2 || d1!=sum || d2!=sum){
                    valid=false;
                }
                if(valid)res++;
            }
        }
        return res;
    }
}