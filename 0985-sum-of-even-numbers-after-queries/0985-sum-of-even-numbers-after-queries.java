class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int idx=queries[i][1];
            nums[idx]+=val;
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0){
                    sum+=nums[j];
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}