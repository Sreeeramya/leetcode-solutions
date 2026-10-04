class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        int c=0;
        int p1=-1;
        int p2=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(p1==-1)p1=i;
                if(p1!=-1)p2=i;
            }
        }
        if(c!=2)return false;
        return s1.charAt(p1)==s2.charAt(p2) && s1.charAt(p2)==s2.charAt(p1);
    }
}