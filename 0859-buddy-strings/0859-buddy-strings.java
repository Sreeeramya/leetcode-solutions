class Solution {
    public boolean buddyStrings(String s, String goal) {
        HashSet<Character> h1=new HashSet<>();
        int f=-1;
        int se=-1;
        int c=0;
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<=s.length()-1;i++){
            
            if(s.charAt(i)!=goal.charAt(i)){
                c++;
                if(f==-1){
                    f=i;
                    
                }
                else if(se==-1){
                    se=i;
                    
                }
            }
        }
        if(f!=-1 && se!=-1 && c>2){
            return false;
        }
        else if(f!=-1 &&  se!=-1 && c==2){
            if(s.charAt(f)==goal.charAt(se) && s.charAt(se)==goal.charAt(f)){
                return true;
            }
        }
        else if(f==-1 && se==-1 && c==0){
            for(char ch:s.toCharArray()){
                if(h1.contains(ch)){
                    return true;
                }
                h1.add(ch);
            }
            return false;
        }
        return false;
    }
}