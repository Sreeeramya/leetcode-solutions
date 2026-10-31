class Solution {
    public int pivotIndex(int[] nums) {
        int t_sum=0;
        int l_sum=0;
        for(int i=0;i<nums.length;i++){
            t_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int r_sum=t_sum-l_sum-nums[i];
            if(l_sum==r_sum){
                return i;
            }
            l_sum+=nums[i];
        }
        return -1;
    }
}