class Solution {
    public int find_max(int nums[],int b){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=b;i++){
            if(nums[i]>max)max=nums[i];
        }
        return max;
    }
    public int find_min(int nums[],int j){
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=j;i<=n-1;i++){
            if(nums[i]<min)min=nums[i];
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int ma=find_max(nums,i);
            int mi=find_min(nums,i);
            if(ma-mi<=k){
                return i;
            }
        }
        return -1;
    }
}