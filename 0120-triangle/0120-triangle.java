class Solution {
    public int minimumTotal(List<List<Integer>> l1) {
        int n=l1.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int c=l1.get(i).get(j);
                int b=l1.get(i+1).get(j);
                int d=l1.get(i+1).get(j+1);
                l1.get(i).set(j,c+Math.min(b,d));
            }
        }
        return l1.get(0).get(0);
    }
}