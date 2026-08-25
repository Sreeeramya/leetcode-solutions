class Solution {
    public int maxPower(String s) {
        int i=0;
        int j=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                c++;
                if(c>max)max=c;
                j++;
            }
            else if(s.charAt(i)!=s.charAt(j)){
                c=0;
                i++;
            }
        }
        return max;
    }
}