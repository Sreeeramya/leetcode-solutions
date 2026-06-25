class Solution {
    public String simplifyPath(String path) {
        Stack<String> s1=new Stack<>();
        String paths[]=path.split("/");
        for(String s:paths){
            if(s.equals("..")){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }
            else if(s.equals("")){
                continue;
            }
            else if(s.equals(".")){
                continue;
            }
            else{
                s1.push(s);
            }
        }
        StringBuilder s2=new StringBuilder();
        s2.append("/");
        for(String s:s1){
            s2.append(s+"/");
        }
        if(s2.length()>1){
            s2.deleteCharAt(s2.length()-1);
        }
        
        return s2.toString();
    }
}