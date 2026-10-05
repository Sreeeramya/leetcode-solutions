class Solution {
    public String breakPalindrome(String s) {
        if(s.length()==1)return "";
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!='a'){
                str.setCharAt(i,'a');
                return str.toString();
            }
        }
        str.setCharAt(s.length()-1,'b');
        return str.toString();
    }
}