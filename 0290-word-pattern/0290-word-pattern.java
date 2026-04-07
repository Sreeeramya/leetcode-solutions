class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String words[]=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> h1=new HashMap<>();
        Set<String> s1=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c1=pattern.charAt(i);
            if(h1.containsKey(c1)){
                if(!h1.get(c1).equals(words[i])){
                    return false;
                }
            }
            else if(s1.contains(words[i])){
                return false;
            }
            h1.put(c1,words[i]);
            s1.add(words[i]);
        }
        return true;
    }
}