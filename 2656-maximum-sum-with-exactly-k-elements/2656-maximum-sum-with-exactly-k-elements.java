class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        while(k>0){
            sum+=nums[n-1];
            nums[n-1]+=1;
            k--;
        }
        return sum;
    }
}