class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]<pivot){
                arr[i]=nums[j];
                i++;
            }
            j++;
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]==pivot){
                arr[i]=pivot;
                i++;
            }
        }
        for(int z=0;z<nums.length;z++){
            if(nums[z]>pivot){
                arr[i]=nums[z];
                i++;
            }
        }
        return arr;
    }
}