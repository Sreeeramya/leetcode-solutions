class Solution {
    public String modifyString(String s) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(str.charAt(i)=='?'){
                for(char ch='a';ch<='z';ch++){
                    if((i==0 || str.charAt(i-1)!=ch) && (i==str.length()-1 || str.charAt(i+1)!=ch)){
                        str.setCharAt(i,ch);
                        break;
                    }
                }
            }
        }
        return str.toString();
    }
}