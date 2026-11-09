class Solution {
    public int captureForts(int[] arr) {
        int maxl=0;
        int prev=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1  || arr[i]==1){
                if(prev!=-1 && arr[i]!=arr[prev]){
                    int l=i-prev-1;
                    maxl=Math.max(maxl,l);
                }
                prev=i;
            }
        }
        return maxl;
    }
}