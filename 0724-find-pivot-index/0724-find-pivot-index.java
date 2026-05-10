class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum_left[]=new int[n];
        int sum_right[]=new int[n];
        sum_left[0]=sum_right[n-1]=0;
        for(int i=1;i<n;i++){
            sum_left[i]=nums[i-1]+sum_left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sum_right[i]=nums[i+1]+sum_right[i+1];
        }
        for(int i=0;i<n;i++){
            if(sum_left[i]==sum_right[i]){
                return i;
            }
        }
        return -1;
    }
}