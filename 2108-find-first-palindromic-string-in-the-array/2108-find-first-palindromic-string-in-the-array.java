class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(reverse(words[i])){
                return words[i];
                
            }
        }
        return "";
    }
    public boolean reverse(String s){
        String s1="";
        char ch[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s.equals(s1)){
            return true;
        }
        return false;
    }
}