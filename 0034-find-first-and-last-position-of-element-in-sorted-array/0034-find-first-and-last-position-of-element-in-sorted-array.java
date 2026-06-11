class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=check_first(nums,target);
        int l=check_last(nums,target);
        return new int[]{f,l};
    }
    public int check_first(int nums[],int t){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public int check_last(int nums[],int t){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                ans=mid;
                s=mid+1;
            }
            else if(nums[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}