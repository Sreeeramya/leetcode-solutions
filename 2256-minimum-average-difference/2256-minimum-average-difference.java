class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }
        long prefix_left[]=new long[n];
        prefix_left[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix_left[i]=prefix_left[i-1]+nums[i];
        }
        long prefix_right[]=new long[n];
        prefix_right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            prefix_right[i]=prefix_right[i+1]+nums[i+1];
        }
        long ans[]=new long[n];

        ans[0]=Math.abs(prefix_left[0]-(prefix_right[0]/(n-1)));
        ans[n-1]=Math.abs(prefix_left[n-1]/n-0);
        for(int i=1;i<n-1;i++){
            ans[i]=Math.abs(prefix_left[i]/(i+1)-prefix_right[i]/(n-i-1));
        }
        long min=Long.MAX_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            
            if(ans[i]<min){
                min=ans[i];
                index=i;
            }
            
        }
        return index;
    }
}