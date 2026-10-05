class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==1)return 1;
        int len=0;
        boolean odd=false;
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:h1.keySet()){
            if(h1.get(ch)%2==0){
                len+=h1.get(ch);
            }
            else{
                if(h1.get(ch)!=1)len+=h1.get(ch)-1;
                odd=true;
            }
        }
        if(odd)len++;
        return len;
    }
}