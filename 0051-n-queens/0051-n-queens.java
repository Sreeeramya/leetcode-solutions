class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        boolean board[][]=new boolean[n][n];
        ans=n_queen(board,0);
        return ans;
    }
    public List<List<String>> n_queen(boolean board[][],int r){
        if(r==board.length){
            List<List<String>> l2=new ArrayList<>();
            l2.add(display(board));
            System.out.println();
            return l2;
        }
        int c=0;
        List<List<String>> ans=new ArrayList<>();
        for(int col=0;col<board.length;col++){
            if(is_safe(board,r,col)){
                board[r][col]=true;
                ans.addAll(n_queen(board,r+1));
                board[r][col]=false;
            }
        }
        return ans;
    }
    public boolean is_safe(boolean board[][],int r,int c){
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }
        int max_left=Math.min(r,c);
        for(int i=1;i<=max_left;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        int max_right=Math.min(r,board.length-c-1);
        for(int i=1;i<=max_right;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    public List<String> display(boolean board[][]){
        List<String> l1=new ArrayList<>();
        for(boolean row[]:board){
            String s="";
            for(boolean elem :row){
                if(elem){
                    s+="Q";
                }
                else{
                    s+=".";
                }
            }
            l1.add(s);
        }
        return l1;
    }
}