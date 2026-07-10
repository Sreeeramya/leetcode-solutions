class Solution {
    public int dominantIndex(int[] nums) {
        int j=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=Math.max(max,nums[i]);
                j=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==j){
                continue;
            }
            if(nums[i]*2>max){
                j=-1;
                break;
            }
        }
        return j;
    }
}