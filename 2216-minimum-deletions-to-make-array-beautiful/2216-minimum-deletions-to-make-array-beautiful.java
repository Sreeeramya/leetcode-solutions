class Solution {
    int c=0;
    public int minDeletion(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            else if(nums[i]!=nums[i+1]){
                i++;
            }
        }
        if((nums.length-c)%2!=0){
            c++;
        }
        return c;
    }
}