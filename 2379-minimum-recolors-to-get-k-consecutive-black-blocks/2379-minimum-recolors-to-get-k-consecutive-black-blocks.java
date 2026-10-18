class Solution {
    public int minimumRecolors(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W')c++;
        }
        int min=c;
        
        for(int i=k;i<s.length();i++){
            char ch1=s.charAt(i-k);
            if(ch1=='W')c--;
            char ch2=s.charAt(i);
            if(ch2=='W')c++;
            min=Math.min(min,c);
        }
        return min;
    }
}