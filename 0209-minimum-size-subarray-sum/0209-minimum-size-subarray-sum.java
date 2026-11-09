class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int l=0;
        int s=0;
        int minl=Integer.MAX_VALUE;
        for(int r=0;r<arr.length;r++){
            s+=arr[r];
            while(s>=t){
                minl=Math.min(minl,r-l+1);
                s-=arr[l];
                l++;
            }
        }
        if(minl==Integer.MAX_VALUE)return 0;
        return minl;
    }
}