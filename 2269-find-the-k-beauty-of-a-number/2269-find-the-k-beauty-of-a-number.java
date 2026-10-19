class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i<=s.length()-k;i++){
            int a=Integer.parseInt(s.substring(i,i+k));
            if(a!=0 && num%a==0)c++;
        }
        return c;
    }
}