class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                c++;
            }
        }
        if(c!=0){
            return (int)((c*100)/n);
        }
        return 0;
    }
}