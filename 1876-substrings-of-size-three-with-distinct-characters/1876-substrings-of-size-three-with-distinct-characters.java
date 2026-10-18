class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        if(s.length()<=2)return c;
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<3;i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
        }
        if(h1.size()==3)c++;
        
        for(int i=3;i<s.length();i++){
            char ch1=s.charAt(i-3);
            h1.put(ch1,h1.get(ch1)-1);
            if(h1.get(ch1)==0)h1.remove(ch1);
            char ch2=s.charAt(i);
            h1.put(ch2,h1.getOrDefault(ch2,0)+1);
            if(h1.size()==3){
                c++;
            }
        }
        return c;
    }
}