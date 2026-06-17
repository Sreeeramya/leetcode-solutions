class Solution {
    public int majorityElement(int[] nums) {
        // int b=0;
        // int n=nums.length;
        // HashMap<Integer,Integer> h1=new HashMap<>();
        // for(int a:nums){
        //     h1.put(a,h1.getOrDefault(a,0)+1);
        // }
        // for(int a:h1.keySet()){
        //     if(h1.get(a)>n/2){
        //         b=a;
        //     }
        // }
        // return b;

        int candidate=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                candidate=nums[i];
                c++;
            }
            else if(nums[i]==candidate){
                c++;
            }
            else if(nums[i]!=candidate){
                c--;
            }
            
        }
        return candidate;
    }
}