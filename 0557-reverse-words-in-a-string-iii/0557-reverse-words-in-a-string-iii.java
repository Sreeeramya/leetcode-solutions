class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        StringBuilder a=new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder s1=new StringBuilder(str[i]);
            a.append(s1.reverse());
            if(i!=str.length-1){
                a.append(" ");
            }
        }
        return a.toString();
    }
}