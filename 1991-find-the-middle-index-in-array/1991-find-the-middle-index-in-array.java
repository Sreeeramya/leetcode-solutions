class Solution {
    public int findMiddleIndex(int[] nums) {
        int t_sum=0;
        int l_sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            t_sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            int r_sum=t_sum-l_sum-nums[i];
            if(l_sum==r_sum)return i;
            l_sum+=nums[i];
        }
        return -1;
    }
}