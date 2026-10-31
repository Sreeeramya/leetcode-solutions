class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int s=nums[0];
        int e=nums[nums.length-1];
        for(int i=1;i<=e;i++){
            if(s%i==0 && e%i==0){
                max=i;
            }
    }
    return max;
    }
}