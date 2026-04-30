class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch: s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        int first=-1;
        for(int a:h1.values()){
            if(first==-1){
                first=a;
            }
            else if(first!=a){
                return false;
            }
        }
        return true;
    }
}