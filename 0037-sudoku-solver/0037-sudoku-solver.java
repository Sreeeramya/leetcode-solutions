class Solution {
    public boolean solve(char board[][],int r,int c){
        if(r==9){
            return true;
        }
        if(c==9){
            return solve(board,r+1,0);
        }
        if(board[r][c]!='.'){
            return solve(board,r,c+1);
        }
        for(int i=1;i<=9;i++){
            if(is_safe(board,r,c,i)){
                board[r][c]=(char)('0'+i);

                if(solve(board,r,c+1)){
                    return true;
                }
                board[r][c]='.';
            }
        }
        return false;
    }
    public boolean is_safe(char[][]board,int r,int c,int num){
        char ch = (char)('0' + num);
        for(int i=0;i<9;i++){
            if(board[r][i]==ch){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][c]==ch){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int r_start=r-r%sqrt;
        int c_start=c-c%sqrt;
        for(int i=r_start;i<r_start+3;i++){
            for(int j=c_start;j<c_start+3;j++){
            if(board[i][j]==ch){
                return false;
            }
        }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
}