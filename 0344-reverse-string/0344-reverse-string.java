class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length;
        for(int i=0;i<b;i++){
            char temp=s[a];
            s[a]=s[b-1];
            s[b-1]=temp;
            a++;
            b--;
        }
    }
}