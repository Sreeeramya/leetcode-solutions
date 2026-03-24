class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        StringBuilder str1=new StringBuilder(str);
        if(str.equals(str1.reverse().toString())){
            return true;
        }
        return false;
    }
}