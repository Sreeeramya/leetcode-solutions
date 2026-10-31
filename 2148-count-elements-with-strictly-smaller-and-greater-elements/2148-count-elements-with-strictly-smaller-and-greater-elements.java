class Solution {
    public int countElements(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int s=nums[0];
        int e=nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>s  && nums[i]<e)c++;
        }
        return c;
    }
    
}