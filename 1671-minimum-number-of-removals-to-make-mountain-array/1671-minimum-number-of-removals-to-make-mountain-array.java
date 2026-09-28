class Solution {
    public int minimumMountainRemovals(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
        }
        int dp1[]=new int[n];
        Arrays.fill(dp1,1);
        for(int i=n-1;i>=1;i--){
            int max=0;
            for(int j=n-1;j>i;j--){
                if(arr[j]<arr[i]){
                    max=Math.max(max,dp1[j]);
                }
            }
            dp1[i]=max+1;
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(dp[i]>1 && dp1[i]>1)res=Math.max(res,dp[i]+dp1[i]-1);
        }
        return n-res;
    }
}