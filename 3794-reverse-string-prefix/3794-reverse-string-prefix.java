class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str=new StringBuilder();
        str.append(s.substring(0,k));
        str.reverse();
        str.append(s.substring(k));
        return str.toString();
    }
}