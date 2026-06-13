class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(n<k){
            return -1;
        }
        int s2=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<n;i++){
            s2+=nums[i];
        }
        int s=max;
        int e=s2;
        int res=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(isvalid(nums,n,k,m)){
                res=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return res;
    }
    public boolean isvalid(int nums[],int n,int k,int m){
        int s1=1;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum+nums[i]<=m){
                 sum+=nums[i];
            }
           
            else if(sum+nums[i]>m){
                s1++;
                sum=nums[i];
                if(s1>k){
                    return false;
                }
            }
        }
        return true;
    }
}