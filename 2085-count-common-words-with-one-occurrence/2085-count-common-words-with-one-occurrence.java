class Solution {
    public int countWords(String[] words1, String[] words2) {
        int c=0;
        HashMap<String,Integer> h1=new HashMap<>();
        for(String s:words1){
            h1.put(s,h1.getOrDefault(s,0)+1);
        }
        HashMap<String,Integer> h2=new HashMap<>();
        for(String s:words2){
            h2.put(s,h2.getOrDefault(s,0)+1);
        }
        for(String s:h1.keySet()){
            if(h2.containsKey(s) && h1.get(s)==1 && h2.get(s)==1){
                c++;
            }
        }
        return c;
    }
}