class Solution {
    public int[] applyOperations(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                arr[i]=nums[j];
                i++;
            }
            j++;
        }
        while(i<nums.length){
            arr[i]=0;
            i++;
        }
        return arr;
    }
    
}