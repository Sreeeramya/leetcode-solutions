class Solution {
    public boolean isPalindrome(String s) {
     
        String s1 = s.toLowerCase();
        s1=s1.replaceAll("[^a-zA-Z0-9]","");

        StringBuilder str1=new StringBuilder(s1);
        str1=str1.reverse();
        if(s1.equals(str1.toString())){
            return true;
        }
        return false;
    }
}