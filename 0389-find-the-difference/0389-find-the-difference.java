class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)-1);
            if(h1.get(ch)<0){
                return ch;
            }
        }
        return ' ';
    }
}