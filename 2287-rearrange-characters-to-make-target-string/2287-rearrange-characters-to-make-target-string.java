class Solution {
    public int rearrangeCharacters(String s, String target) {
        int ans=Integer.MAX_VALUE;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(char ch:s.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            freq2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq2[i]>0){
                ans=Math.min(ans,freq1[i]/freq2[i]);
            }
        }
        return ans;
    }
}