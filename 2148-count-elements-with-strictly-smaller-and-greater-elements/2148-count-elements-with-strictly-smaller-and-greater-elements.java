class Solution {
    public int countElements(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++){
            int s=find_small(i,nums);
            int l=find_large(i,nums);
            if(s!=-1  && l!=-1)c++;
        }
        return c;
    }
    public int find_small(int idx,int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<idx;i++){
            if(nums[i]<nums[idx]){
                min=Math.min(nums[i],min);
            }
        }
        if(min!=Integer.MAX_VALUE)return min;
        return -1;
    }
    public int find_large(int idx,int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]>nums[idx]){
                max=Math.max(nums[i],max);
            }
        }
        if(max!=Integer.MIN_VALUE)return max;
        return -1;
    }
}