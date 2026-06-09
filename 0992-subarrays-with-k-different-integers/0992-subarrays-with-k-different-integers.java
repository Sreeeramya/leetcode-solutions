class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }
    public int check(int nums[],int k){
        int i=0;
        int j=0;
        int c=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        while(j<nums.length){
            int b=nums[j];
            h1.put(b,h1.getOrDefault(b,0)+1);
            while(h1.size()>k){

                int a=nums[i];
                h1.put(a,h1.get(a)-1);
                if(h1.get(a)==0){
                    h1.remove(a);
                }
                i++;
            }
            c+=(j-i+1);
            j++;
        }
        return c;
        
    }
}