class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:chars.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        int c=0;
       
       
        for(String a:words){
            boolean v=true;
            HashMap<Character,Integer> h2=new HashMap<>();
            for(char ch:a.toCharArray()){
                h2.put(ch,h2.getOrDefault(ch,0)+1);
            }
            for(char ch:h2.keySet()){
                if(h2.get(ch)>h1.getOrDefault(ch,0)){
                    v=false;
                    break;
                }
            }
            if(v==true){
                c+=a.length();
            }
            
        }
        return c;
    }
}