class Solution {
    public int reverseDegree(String s) {
        int deg=0;
        for(int i=0;i<s.length();i++){
            deg+=('z'-s.charAt(i)+1)*(i+1);
        }
        return deg;
    }
}