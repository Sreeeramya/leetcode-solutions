class Solution {
    public String addSpaces(String s, int[] spaces) {
        int j=0;
        int k=0;
        StringBuilder str=new StringBuilder();
        while(j<s.length()){
            if(k<spaces.length && spaces[k]==j){
                str.append(" ");
                k++;
            }
            str.append(s.charAt(j));
            j++;
        }
        return str.toString();
    }
}