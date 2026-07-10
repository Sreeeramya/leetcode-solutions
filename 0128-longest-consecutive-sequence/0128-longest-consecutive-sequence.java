class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=1;
        HashSet<Integer> h1=new HashSet<>();
        for(int a:nums){
            h1.add(a);
        }
        for(int a:h1){
            if(!h1.contains(a-1)){
                int cur=a;
                int length=1;
                while(h1.contains(cur+1)){
                    cur++;
                    length++;
                }
                max=Math.max(max,length);
            }
        }
        return max;
    }
}