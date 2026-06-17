class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(int a:h1.keySet()){
            if(h1.get(a)>n/3){
                l1.add(a);
            }
        }
        return l1;
    }
}