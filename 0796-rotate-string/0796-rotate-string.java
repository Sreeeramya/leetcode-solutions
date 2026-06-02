class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder str1=new StringBuilder();
        str1.append(s);
        str1.append(s);
        String s1=str1.toString();
        if(s1.contains(goal)){
            return true;
        }
        return false;
    }
}