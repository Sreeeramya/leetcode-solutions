class Solution {
    public String makeGood(String s) {
        Stack<Character> s1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!s1.isEmpty() && Math.abs(s1.peek()-ch)==32){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        for(char c:s1){
            str.append(c);
        }
        return str.toString();
    }
}