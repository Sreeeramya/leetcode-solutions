class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0;
        int c2=0;
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                c1++;
            }
        }
        for(int i=n/2;i<n;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                c2++;
            }
        }
        if(c1==c2){
            return true;
        }
        return false;
    }
}