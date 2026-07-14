class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char ch_prev=s.charAt(i-1);
            if(Character.isDigit(ch)){
                int digit=ch-'0';

                sb.append((char)(ch_prev+digit));
            }
            else{
                sb.append(ch);
            }
            
            
        }
        return sb.toString();
    }
}