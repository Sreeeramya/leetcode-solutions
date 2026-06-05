class Solution {
    public String longestPalindrome(String s) {
        int max=-1;
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(is_palin(s,i,j)){
                    if(j-i+1>max){
                        max=Math.max(max,j-i+1);
                        a=i;
                        b=j;
                    }  
                }            
            }
        }
        return s.substring(a,b+1);
    }
    private boolean is_palin(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}