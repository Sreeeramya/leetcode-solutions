class Solution {
    public int waysToSplitArray(int[] nums) {
        long t_sum=0;
        long l_sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            t_sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            l_sum+=nums[i];
            long r_sum=t_sum-l_sum;
            if(l_sum>=r_sum)c++;
        }
        return c;
    }
}