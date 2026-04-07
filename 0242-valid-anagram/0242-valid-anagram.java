class Solution {
    public boolean isAnagram(String s, String t) {
        char str1[]=s.toCharArray();
        
        Arrays.sort(str1);
        String s1=new String(str1);
        char str2[]=t.toCharArray();
        Arrays.sort(str2);
        String s2=new String(str2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}