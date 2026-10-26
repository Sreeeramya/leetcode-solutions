class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> s1=new Stack<>();
        Stack<Integer> count=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!s1.isEmpty() && s1.peek()==ch){
                count.push(count.peek()+1);
            }
            else{
                count.push(1);
            }
            s1.push(ch);
            if(count.peek()==k){
                for(int i=0;i<k;i++){
                    s1.pop();
                    count.pop();
                }
            }
        }
        for(char ch:s1){
            str.append(ch);
        }
        return str.toString();
    }
}