class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int c=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
            
        }
        if(k==0){
            for(int a:h1.keySet()){
                if(h1.get(a)>1){
                    c++;
                }
            }
        }
        else{
            for(int a:h1.keySet()){
            if(h1.containsKey(a+k)){
                c++;
            }
        }
        }
        
        return c;
    }
}