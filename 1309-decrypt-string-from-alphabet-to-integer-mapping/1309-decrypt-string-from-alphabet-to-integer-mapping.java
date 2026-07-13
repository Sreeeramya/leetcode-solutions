class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                int value=Integer.parseInt(s.substring(i-2,i));
                str.append((char)('a'+value-1));
                i-=2;
            }
            else{
                int val=s.charAt(i)-'0';
                str.append((char)('a'+val-1));
            }
        }
        return str.reverse().toString();
    }
}