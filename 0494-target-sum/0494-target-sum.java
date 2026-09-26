class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int total=0;
        for(int a:nums){
            total+=a;
        }
        int dp[][]=new int[n][2*total+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(0,0,nums,target,dp,total);
    }
    public int find(int i,int sum,int nums[],int target,int dp[][],int total){
        if(i==nums.length){
            if(sum==target)return 1;
            else return 0;
        }
        int idx=sum+total;
        if(dp[i][idx]!=-1)return dp[i][idx];
        int plus=find(i+1,sum+nums[i],nums,target,dp,total);
        int minus=find(i+1,sum-nums[i],nums,target,dp,total);
        return dp[i][idx]=plus+minus;
    }
}