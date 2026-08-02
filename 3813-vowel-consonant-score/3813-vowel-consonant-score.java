class Solution {
    public int vowelConsonantScore(String s) {
        double v=0;
        double c=0;
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                v++;
            }
            else if("0123456789 ".indexOf(ch)!=-1){
                continue;
            }
            else{
                c++;
            }
        }
        if(c>0){
            return (int) Math.floor(v/c);
        }
        return 0;
    }
}