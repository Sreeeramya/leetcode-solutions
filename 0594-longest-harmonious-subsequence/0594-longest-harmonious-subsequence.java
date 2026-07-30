class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(int a:h1.keySet()){
            if(h1.containsKey(a+1)){
                max=Math.max(h1.get(a)+h1.get(a+1),max);
            }
        }
        return max;
    }
}