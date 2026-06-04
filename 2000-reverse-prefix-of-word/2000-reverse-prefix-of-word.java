class Solution {
    public String reversePrefix(String word, char ch) {
        
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                StringBuilder s2=new StringBuilder(word.substring(0,i+1));
                str1.append(s2.reverse());
                str1.append(word.substring(i+1,word.length()));
                return str1.toString();
            }
        }
        return word;
    }
}