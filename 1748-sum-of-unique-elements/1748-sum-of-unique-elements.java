class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(int a:h1.keySet()){
            if(h1.get(a)==1){
                sum+=a;
            }
        }
        return sum;
    }
}