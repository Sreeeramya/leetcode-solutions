class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int idx=find_min(nums);
            nums[idx]=nums[idx]*multiplier;
            k--;
        }
        return nums;
    }
    public int find_min(int arr[]){
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                idx=i;
                min=Math.min(min,arr[i]);
            }
        }
        return idx;
    }
}