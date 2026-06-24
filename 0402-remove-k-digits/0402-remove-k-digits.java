class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s1=new Stack<>();
        for(char ch:num.toCharArray()){
            int d=ch-'0';
            while(!s1.isEmpty() && k>0 && s1.peek()>d){
                s1.pop();
                k--;
            }
            s1.push(d);
        }
        while(k>0){
            s1.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();
        for(int a:s1){
            str.append(a);
        }
       
        while(str.length()>0 && str.charAt(0)=='0'){
            str.deleteCharAt(0);
        }
         if(str.length()==0){
            return "0";
        }
        return str.toString();
    }
}