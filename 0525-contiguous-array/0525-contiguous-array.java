class Solution {
    public int findMaxLength(int[] nums) {
        int p=0;
        int max_length=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                p+=1;
            }
            else if(nums[i]==1){
                p+=-1;;
            }
            if(h1.containsKey(p)){
                max_length=Math.max(i-h1.get(p),max_length);
            }
            else{
                h1.put(p,i);
            }
        }
        return max_length;
    }
}