class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int c_max=nums[0];
        int max=nums[0];

        int c_min=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            c_max=Math.max(nums[i],c_max+nums[i]);
            max=Math.max(c_max,max);

            c_min=Math.min(nums[i],c_min+nums[i]);
            min=Math.min(c_min,min);

        }
        return Math.max(max,Math.abs(min));
    }
}