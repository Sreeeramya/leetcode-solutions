class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                return nums[j];
            }
            j++;
        }
        return -1;
    }
}