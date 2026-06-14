class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
            
            int prefix=0;
            int c=0;
            HashMap<Integer,Integer> h1=new HashMap<>();
            h1.put(0,-1);
            for(int i=0;i<nums.length;i++){
                prefix+=nums[i];
                int t=prefix%k;
                if(h1.containsKey(t)){
                    if(i-h1.get(t)>=2){
                        return true;
                    }
                }
                else{
                    h1.put(t,i);
                }
                
            }
        
        return false;
    }
}