class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq1[]=new int[26];
        for(char ch:chars.toCharArray()){
            freq1[ch-'a']++;
        }
        int c=0;
        for(String a:words){
            boolean v=true;
            int freq2[]=new int[26];
            for(char ch:a.toCharArray()){
            freq2[ch-'a']++;
            if(freq2[ch-'a']>freq1[ch-'a']){
                v=false;
                break;
            }
            }
            if(v==true){
                c+=a.length();
            }
            
        }
        return c;
    }
}