class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    public String check(String s){
        StringBuilder str1=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                str1.append(ch);
            }
            else if(str1.length()>0){
                str1.deleteCharAt(str1.length()-1);
            }
        }
        return str1.toString();
    }
}