class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            int a=count_zero(i,s);
            int b=count_one(i,s);
            max=Math.max(a+b,max);
        }
        return max;
    }
    public int count_zero(int idx,String s) {
        int c=0;
        for(int i=0;i<=idx;i++){
            if(s.charAt(i)=='0'){
                c++;
            }
        }
        return c;
    }
    public int count_one(int idx,String s) {
        int c=0;
        for(int i=idx+1;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}