class Solution {
    public int maximumGain(String s, int x, int y) {
        int c=0;
        String first,second;
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        if(x>=y){
            first="ab";
            second="ba";
        }
        else{
            first="ba";
            second="ab";
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!s1.isEmpty() && s1.peek()==first.charAt(0) && ch==first.charAt(1)){
                s1.pop();
                c+=Math.max(x,y);
            }
            else{
                s1.push(ch);
            }
        }
        for(char ch:s1){
            if(!s2.isEmpty() && s2.peek()==second.charAt(0) && ch==second.charAt(1)){
                s2.pop();
                c+=Math.min(x,y);
            }
            else{
                s2.push(ch);
            }
        }
        return c;
    }
}