class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }

        //     }
        // }
        // return new int[]{-1,-1};
        HashMap<Integer,Integer> h1=new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(h1.containsKey(c)){
                return new int[]{h1.get(c),i};
            }
            h1.put(nums[i],i);
        }
        return new int[]{-1,-1};
        }
}