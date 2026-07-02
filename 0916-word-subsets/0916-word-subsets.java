class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character,Integer> h1=new HashMap<>();
        List<String> l1=new ArrayList<>();
        for(String a:words2){
            HashMap<Character,Integer> h2=new HashMap<>();
            for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
                h2.put(ch,h2.getOrDefault(ch,0)+1);
            }

            for(char ch:h2.keySet()){
                h1.put(ch,Math.max(h1.getOrDefault(ch,0),h2.get(ch)));
            }
        }
        for(String a:words1){
            HashMap<Character,Integer> h3=new HashMap<>();
            for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
                h3.put(ch,h3.getOrDefault(ch,0)+1);
            }
            boolean val=true;
            for(char ch:h1.keySet()){
                if(h3.getOrDefault(ch,0)<h1.get(ch)){
                    val=false;
                    break;
                }
            }
            if(val){
                l1.add(a);
            }
        }
        return l1;
    }
}