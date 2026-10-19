class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> h1=new HashSet<>();
        if(k==0)return false;
        for(int i=0;i<Math.min(k,nums.length);i++){
            if(h1.contains(nums[i])){
                return true;
            }
            h1.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(h1.contains(nums[i]))return true;
            h1.remove(nums[i-k]);
            h1.add(nums[i]);
        }
        return false;
    }
}