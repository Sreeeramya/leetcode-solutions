class Solution {
    public int percentageLetter(String s, char letter) {
        int n1=s.length();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                c++;
            }
        }
        if(c!=0){
            return (int)((c*100)/n1);
        }
        return 0;
    }
}