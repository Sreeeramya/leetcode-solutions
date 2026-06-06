class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String w[]=new String[arr.length];
        for(String a:arr){
            int b=a.charAt(a.length()-1)-'0';
            w[b-1]=a.substring(0,a.length()-1);
        }
        return String.join(" ",w);
    }
}