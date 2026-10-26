class Solution {
    public int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")){
            if(s.contains("AB")){
                int idx=s.indexOf("AB");
                s=s.substring(0,idx)+s.substring(idx+2);
            }
            else{
                int idx=s.indexOf("CD");
                s=s.substring(0,idx)+s.substring(idx+2);
            }
        }
        return s.length();
    }
}