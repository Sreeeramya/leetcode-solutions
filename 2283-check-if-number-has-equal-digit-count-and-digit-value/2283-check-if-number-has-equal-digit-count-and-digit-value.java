class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:num.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++){
            char ch=(char)(i+'0');
            if(h1.getOrDefault(ch,0)!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}