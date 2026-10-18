class Solution {
    public int minimumRecolors(String s, int k) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<k;i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
        }
        int min=h1.getOrDefault('W',0);
        
        for(int i=k;i<s.length();i++){
            char ch1=s.charAt(i-k);
            h1.put(ch1,h1.get(ch1)-1);
            if(h1.get(ch1)==0)h1.remove(ch1);
            char ch2=s.charAt(i);
            h1.put(ch2,h1.getOrDefault(ch2,0)+1);
            min=Math.min(min,h1.getOrDefault('W',0));
        }
        return min;
    }
}