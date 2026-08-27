class Solution {
    public int help(int nums[],int t,int lo,int hi){
        if(lo>hi)return -1;
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==t)return mid;
        else if(nums[mid]>t)return help(nums,t,lo,mid-1);
        else return help(nums,t,mid+1,hi);
    }
    public int search(int[] nums, int target) {
         int n=nums.length;
         return help(nums,target,0,n-1);
    }
}