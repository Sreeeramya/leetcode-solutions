class Solution {
    public int repeatedNTimes(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        int n=nums.length/2;
        for(int a:h1.keySet()){
            if(h1.get(a)==n){
                ans=a;
            }
        }
        return ans;
    }
}