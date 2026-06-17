class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(h1.containsKey(val)){
                return new int[]{i,h1.get(val)};
            }
            h1.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}