class Solution {
    public boolean checkZeroOnes(String s) {
        if(s.length()==1 && s.charAt(0)=='1')return true;
        int c=1;
        int max=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1' && s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else c=1;
            max=Math.max(c,max);
        }
        c=1;
        int max1=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0' && s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else c=1;
            max1=Math.max(c,max1);
        }
        if(max>max1)return true;
        return false;
    }
}