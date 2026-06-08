class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        while(j<s.length()){
            if("aeiou".indexOf(s.charAt(j))!=-1){
                c++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(c,max);
                if ("aeiou".indexOf(s.charAt(i))!=-1) {
                    c--;
                }
                i++;
                j++;
            }
            
        }
        return max;
    }
}