class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int m=1<<n;
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> l2=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i>>j)%2==1)l2.add(nums[j]);
            }
            l1.add(l2);
        }
        return l1;
    }
}