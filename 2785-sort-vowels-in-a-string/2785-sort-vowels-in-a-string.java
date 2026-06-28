class Solution {
    public String sortVowels(String s) {
        int c=0;
        int i=0;
        for(char ch:s.toCharArray()){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                c++;
            }
        }
        char c1[]=new char[c];
        for(char ch:s.toCharArray()){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                c1[i++]=ch;
            }
        }
        Arrays.sort(c1);
        i=0;
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if("AEIOUaeiou".indexOf(ch)==-1){
                str.append(ch);
            }
            else{
                str.append(c1[i]);
                i++;
            }
        }
        return str.toString();
    }
}