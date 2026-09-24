class Solution {
    public int countSquares(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0)&& arr[i][j]==1)c+=1;
                else{
                    if(arr[i][j]==1){
                        arr[i][j]=arr[i][j]+Math.min(arr[i][j-1],Math.min(arr[i-1][j-1],arr[i-1][j]));
                        c+=arr[i][j];
                    }
                }
            }
        }
        return c;
    }
}