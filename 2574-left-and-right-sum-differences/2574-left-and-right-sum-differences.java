class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int prefix_l[]=new int[n];
        int prefix_r[]=new int[n];
        int ans[]=new int[n];
        prefix_l[0]=0;
        prefix_r[n-1]=0;
        for(int i=1;i<n;i++){
            prefix_l[i]=prefix_l[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            prefix_r[i]=prefix_r[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(prefix_l[i]-prefix_r[i]);
        }
        return ans;
    }
}