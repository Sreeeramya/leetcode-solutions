class Solution {
    public int smallestIndex(int[] nums) {
        int min_idx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int ans=0;
            while(temp>0){
                ans+=temp%10;
                temp=temp/10;
            }
            if(ans==i)min_idx=Math.min(min_idx,i);
        }
        if(min_idx!=Integer.MAX_VALUE)return min_idx;
        return -1;
    }
}