class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=2;i--){
            int a1=nums[i-2];
            int b1=nums[i-1];
            int c1=nums[i];

            if(a1+b1>c1){
                return a1+b1+c1;
            }
        }
        return 0;
        
    }
}