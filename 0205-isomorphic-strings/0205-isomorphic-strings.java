class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        Set<Character> s1=new HashSet<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(h1.containsKey(c1)){
                if(h1.get(c1)!=c2){
                    return false;
                }
                
            }
            else if(s1.contains(c2)){
                    return false;
                }
                else{
                    h1.put(c1,c2);
                    s1.add(c2);
                }
        }
        return true;
    }
}