class Solution {
    public boolean isValid(String s) {
        while(s.contains("abc")){
            int idx=s.indexOf("abc");
            s=s.substring(0,idx)+s.substring(idx+3);
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}