class Solution {
    public void help(int[] nums,int idx,List<Integer> c,List<List<Integer>>l1){
        if(idx==nums.length){
            l1.add(new ArrayList<>(c));
            return;
        }
        c.add(nums[idx]);
        help(nums,idx+1,c,l1);
        c.remove(c.size()-1);
        help(nums,idx+1,c,l1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1=new ArrayList<>();
        help(nums,0,new ArrayList<>(),l1);
        return l1;
    }
}