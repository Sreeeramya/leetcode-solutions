class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        for(int a:nums){
            if(a>=max){
                s_max=max;
                max=a;
            }
            else if(a>s_max){
                s_max=a;
            }
        }
        return (max-1)*(s_max-1);
    }
}