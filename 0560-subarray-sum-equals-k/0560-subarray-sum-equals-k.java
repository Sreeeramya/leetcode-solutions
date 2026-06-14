class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int prefix=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int t=prefix-k;
            if(h1.containsKey(t)){
                c+=h1.get(t);
            }
            h1.put(prefix,h1.getOrDefault(prefix,0)+1);
        }
        return c;
    }
}