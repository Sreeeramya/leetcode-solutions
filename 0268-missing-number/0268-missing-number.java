class Solution {
    public int missingNumber(int[] nums) {
        int val=nums.length;
        for(int  i=0;i<nums.length;i++){
            val=val^i;
            val=val^nums[i];
        }
        return val;
    }
}