class Solution {
    public boolean digitCount(String num) {
        boolean val=false;
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<num.length();i++){
            char ch=(char)(i+'0');
            h1.put(ch,h1.getOrDefault(ch,0));
        }
        for(char ch:num.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++){
            char ch=(char)(i+'0');
            if(h1.containsKey(ch) && h1.get(ch)==num.charAt(i)-'0'){
                val=true;
            }
            else{
                val=false;
                return false;
            }
        }
        return true;
    }
}