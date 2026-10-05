class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length()==1 && b.length()==1)return true;
        return check_form(a,b) || check_form(b,a);
    }
    public boolean check_form(String a,String b){
        int i=0;
        int j=a.length()-1;
        while(i<j && a.charAt(i)==b.charAt(j)){
            i++;
            j--;
        }
        return check(a,i,j)|| check(b,i,j);
    }
    public boolean check(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}