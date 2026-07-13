class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
            if(c!=k){
                str.append(s.charAt(i));
            }
            if(c==k){
                break;
            }
            
        }
        return str.toString().trim();
    }
}