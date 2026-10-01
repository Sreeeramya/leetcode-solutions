class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char chess[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j]='.';
            }
        }
        queens(0,chess,ans);
        return ans;
    }
    private static void queens(int row, char[][] chess,List<List<String>> ans) {
        int n=chess.length;
        if(row == n){
            List<String> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                list.add(new String(chess[i]));
            }

            ans.add(list);
            return;
        }
        for(int col=0;col<n;col++){
            if(safe(row,col,chess)){
                chess[row][col]='Q';
                queens(row+1,chess,ans);
                chess[row][col]='.';
            }
        }
    }

    private static boolean safe(int row, int col, char[][] chess) {
        int n=chess.length;
        int i=row-1;
        while(i>=0){
            if(chess[i][col]=='Q')return false;
            i--;
        }
        i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(chess[i][j]=='Q')return false;
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(chess[i][j]=='Q')return false;
            i--;
            j++;
        }
        return true;
    }
}