class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean isallowed[]=new boolean[26];
        for(char ch:allowed.toCharArray()){
            isallowed[ch-'a']=true;
        }
        int c=0;
        for(String w:words){
            boolean isconsistent=true;
            for(char ch:w.toCharArray()){
                if(!isallowed[ch-'a']){
                    isconsistent=false;
                    break;
                }
            }
            if(isconsistent){
                c++;
            }
        }
        return c;
    }
}