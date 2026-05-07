class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:word1.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:word2.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)-1);
        }
        for(int val:h1.values()){
            if(Math.abs(val)>3){
                return false;
            }
        }
        return true;
    }
}