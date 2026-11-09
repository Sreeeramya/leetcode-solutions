class Solution {
    public boolean checkValid(int[][] mat) {
        int n=mat.length;
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                h1.add(mat[i][j]);
            }
            if(h1.size()!=n){
                return false;
            }
            h1.clear();
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                h1.add(mat[i][j]);
            }
            if(h1.size()!=n){
                return false;
            }
            h1.clear();
        }
        return true;
    }
}