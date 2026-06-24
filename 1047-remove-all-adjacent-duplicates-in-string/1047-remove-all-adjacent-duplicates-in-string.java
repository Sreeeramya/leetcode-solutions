class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!s1.isEmpty() && s1.peek()==ch){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s1){
            sb.append(ch);
        }
        return sb.toString();
    }
}