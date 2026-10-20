class Solution {
    public boolean checkString(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='a' && s.substring(0,i).indexOf('b')!=-1){
                return false;
            }
        }
        return true;
    }
}