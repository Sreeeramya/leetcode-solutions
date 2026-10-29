class Solution {
    public int maxOperations(int[] nums) {
        int n=nums.length;
        int c=1;
        int sum=nums[0]+nums[1];
        if(n%2!=0){
            for(int i=2;i<n-2;i+=2){
                if(nums[i]+nums[i+1]==sum)c++;
                else break;
            }
        }
        else{
            for(int i=2;i<=n-2;i+=2){
                if(nums[i]+nums[i+1]==sum)c++;
                else break;
            }
        }
        return c;
    }
}