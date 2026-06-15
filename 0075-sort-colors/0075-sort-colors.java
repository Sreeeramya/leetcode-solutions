class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        int k=0;
        while(k<nums.length){
            if(nums[k]==1){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
            }
            k++;
        }
        int t=0;
        while(t<nums.length){
            if(nums[t]==2){
                int temp=nums[i];
                nums[i]=nums[t];
                nums[t]=temp;
                i++;
            }
            t++;
        }
    }
}