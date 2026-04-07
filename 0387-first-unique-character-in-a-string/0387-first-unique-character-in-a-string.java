class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(h1.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}