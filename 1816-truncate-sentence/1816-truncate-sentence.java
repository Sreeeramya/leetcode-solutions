class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str=new StringBuilder();
        String s1[]=s.split(" ");
        for(int i=0;i<k;i++){
            str.append(s1[i]).append(" ");
        }
        return str.toString().trim();
    }
}