class Solution {
    public int maxFrequencyElements(int[] nums) {
        int c=0;
        int max=1;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(int a:h1.keySet()){
            if(h1.get(a)>=max){
                max=Math.max(max,h1.get(a));
            }
        }
        for(int a:h1.keySet()){
            if(h1.get(a)==max){
                c+=h1.get(a);
            }
        }
        return c;
    }
}