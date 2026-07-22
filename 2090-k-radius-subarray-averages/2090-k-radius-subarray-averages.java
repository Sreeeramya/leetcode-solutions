class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        long p[]=new long[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            
            if(i<k || i+k>=n){
                ans[i]=-1;
            }
            else{
            int l=i-k;
            int r=i+k;
            long sum=0;
            if(l==0){
                sum=p[r];
            }
            else{
                sum=p[r]-p[l-1];
            }
            ans[i]=(int)(sum/(2*k+1));
            }
            
        }
        return ans;
    }
}