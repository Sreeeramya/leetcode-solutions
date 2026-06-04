class Solution {
    public String reverseStr(String s, int k) {
    
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<s.length();i+=2*k){
            int e1=Math.min(i+k,s.length());
            StringBuilder p=new StringBuilder(s.substring(i,e1));
            str1.append(p.reverse());
            int e2=Math.min(i+2*k,s.length());
            if(e1<e2){
                str1.append(s.substring(e1,e2));
            }
        }
        return str1.toString();
    }
}