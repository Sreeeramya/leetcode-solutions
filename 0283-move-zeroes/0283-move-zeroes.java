class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            else if(nums[i]==0){
                c++;
            }
        }
        for(int i=n-c;i<n;i++){
            nums[i]=0;
        }
    }
    
}