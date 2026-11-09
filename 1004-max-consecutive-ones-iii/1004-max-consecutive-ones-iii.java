class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0;
        int maxl=0;
        int z=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]==0)z++;
            while(z>k){
                if(arr[l]==0){
                    z--;
                }
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}