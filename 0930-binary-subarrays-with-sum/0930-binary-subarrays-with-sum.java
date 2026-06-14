class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0;
        int prefix_sum=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix_sum+=nums[i];
            int t=prefix_sum-goal;
            if(h1.containsKey(t)){
                c+=h1.get(t);
            }
            h1.put(prefix_sum,h1.getOrDefault(prefix_sum,0)+1);
        }
        return c;
    }
}