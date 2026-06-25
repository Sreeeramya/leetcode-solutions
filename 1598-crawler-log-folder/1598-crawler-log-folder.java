class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s1=new Stack<>();
        for(String a:logs){
            if(a.equals("../")){
                if(!s1.isEmpty()){
                    s1.pop();
                }
                
            }
            else if(a.equals("./")){
                continue;
            }
            else{
                s1.push(a);
            }
        }
        return s1.size();
    }
}