class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans=Integer.MAX_VALUE;
        String str="balloon";
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(char ch:text.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch:str.toCharArray()){
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