class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int maxlen=0;
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            maxlen=Math.max(maxlen,dp[i]);
        }

        int idx=0;
        for(int i=0;i<n;i++){
            if(maxlen==dp[i]){
                idx=i;
            }
        }
        List<Integer> l1=new ArrayList<>();
        l1.add(arr[idx]);
        while(dp[idx]>1){
            for(int j=idx-1;j>=0;j--){
                if(arr[idx]%arr[j]==0 && dp[idx]-1==dp[j]){
                    l1.add(arr[j]);
                    idx=j;
                    break;
                }
            }
        }
        Collections.reverse(l1);
        return l1;
    }
}