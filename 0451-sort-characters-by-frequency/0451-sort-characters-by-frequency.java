class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch: s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        List<Character> l1=new ArrayList<>(h1.keySet());
        l1.sort((a,b)-> h1.get(b)-h1.get(a));
        StringBuilder str1=new StringBuilder();
        for(char ch:l1){
            int c=h1.get(ch);
            for(int i=0;i<c;i++){
                str1.append(ch);
            }
        }
        return str1.toString();
    }
}