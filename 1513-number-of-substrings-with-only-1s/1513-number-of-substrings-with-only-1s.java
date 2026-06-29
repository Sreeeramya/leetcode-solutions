class Solution {
    public int numSub(String s) {
        long sum=0;
        String arr[]=s.split("0");
        for(int i=0;i<arr.length;i++){
            int n=arr[i].length();
            if(n>0){
                sum+=(long)n*(n+1)/2;
            }
        }
        long mod=1000000007;
        sum%=mod;
        return (int)sum;
    }
}