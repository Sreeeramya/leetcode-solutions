class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if(k==1 && s.length()==1)return true;
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))count++;
            else count=1;
            if(count==k){
                if(i==s.length()-1 || s.charAt(i+1)!=s.charAt(i))return true;
            }
        }
        if(k==1  && s.charAt(0)!=s.charAt(1))return true;
        return false;
    }
}