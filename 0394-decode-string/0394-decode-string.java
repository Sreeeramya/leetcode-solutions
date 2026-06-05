class Solution {
    public String decodeString(String s) {
        Stack<Integer> c1=new Stack<>();
        Stack<StringBuilder> c2=new Stack<>();
        StringBuilder cur=new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                c1.push(num);
                c2.push(cur);
                num=0;
                cur=new StringBuilder();
            }
            else if(ch==']'){
                int r=c1.pop();
                StringBuilder prev=c2.pop();
                for(int i=0;i<r;i++){
                    prev.append(cur);
                }
                cur=prev;
            }
            else{
                cur.append(ch);
            }
        }
        return cur.toString();
    }
}