class Solution {
    public String customSortString(String order, String s) {
        StringBuilder str=new StringBuilder();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:order.toCharArray()){
            if(h1.containsKey(ch)){
                for(int i=0;i<h1.get(ch);i++){
                    str.append(ch);
                }
                h1.remove(ch);
            }
        }
        for(char ch:h1.keySet()){
            for(int i=0;i<h1.get(ch);i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}