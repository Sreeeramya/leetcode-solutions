class Solution {
    public void print(int nums[],int idx,List<Integer> l2,List<List<Integer>> l1){
        if(idx==nums.length){
            l1.add(new ArrayList<>(l2));
            return;
        }
        l2.add(nums[idx]);
        print(nums,idx+1,l2,l1);
        l2.remove(l2.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        print(nums,idx+1,l2,l1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l1=new ArrayList<>();
        print(nums,0,new ArrayList<>(),l1);
        return l1;
    }
}