class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        ArrayList<Integer> a1=new ArrayList<>();
       int ans=Integer.MAX_VALUE;
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int a:h1.keySet()){
            if(h1.get(a)>max){
                max=Math.max(max,h1.get(a));
            }
        }
        for(int a:h1.keySet()){
            if(h1.get(a)==max){
                a1.add(a);
            }
        }
        for(int x:a1){
        int first=-1;
        int last=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                first=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==x){
                last=i;
                break;
            }
        }
        ans=Math.min(ans,last-first+1);
        }
        
        return ans;
    }
}