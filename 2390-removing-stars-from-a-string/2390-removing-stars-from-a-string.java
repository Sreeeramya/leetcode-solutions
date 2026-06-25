class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:s1){
            str.append(ch);
        }
        return str.toString();
    }
}