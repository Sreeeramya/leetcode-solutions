class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                l1.add(i);
            }
        }
        return l1;
    }
}