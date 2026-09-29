class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max=Integer.MIN_VALUE;
        int m=nums1.length;
        int n=nums2.length;
        
        int dp[][]=new int[m][n];
        for(int i=0;i<n;i++){
            if(nums1[0]==nums2[i])dp[0][i]=1;
        }
        for(int i=0;i<m;i++){
            if(nums2[0]==nums1[i])dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(nums1[i]==nums2[j])dp[i][j]=1+dp[i-1][j-1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}