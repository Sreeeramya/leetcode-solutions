class Solution {
    public int countAsterisks(String s) {
        boolean f=false;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(f==false){
                    f=true;
                }
                else{
                    f=false;
                }
            }
            else if(f==false && s.charAt(i)=='*'){
                c++;
            }
        }
        return c;
    }
}