class Solution {
    public int mostFrequent(int[] nums, int key) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                h1.put(nums[i+1],h1.getOrDefault(nums[i+1],0)+1);
            }
        }
        for(int a:h1.keySet()){
            if(h1.get(a)>max){
                max=h1.get(a);
                ans=a;
            }
        }
        return ans;
    }
}