class Solution {
    public int findGCD(int[] nums) {
        int max=1;
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        for(int a:nums){
            s=Math.min(s,a);
            e=Math.max(e,a);
        }
        for(int i=1;i<=e;i++){
            if(s%i==0 && e%i==0){
                max=i;
            }
    }
    return max;
    }
}