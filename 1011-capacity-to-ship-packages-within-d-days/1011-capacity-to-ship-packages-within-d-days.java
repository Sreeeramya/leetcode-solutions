class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        for(int a:weights){
            max=Math.max(a,max);
        }
        int sum=0;
        for(int a:weights){
            sum+=a;
        }
        int s=max;
        int e=sum;
        int res=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(isvalid(weights,n,days,m)){
                res=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return res;
    }
    public boolean isvalid(int weights[],int n,int k,int m){
        int s1=1;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum+weights[i]<=m){
                sum+=weights[i];
            }
            else if(sum+weights[i]>m){
                s1++;
                sum=weights[i];
                if(s1>k){
                    return false;
                }
            }
        }
        return true;
    }
}