class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1)return 0;
        int l=0;
        int p=1;
        int c=0;
        for(int r=0;r<arr.length;r++){
            p*=arr[r];
            while(p>=k){
                p/=arr[l];
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
}