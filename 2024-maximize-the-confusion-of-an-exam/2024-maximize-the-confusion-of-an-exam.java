class Solution {
    public int maxConsecutiveAnswers(String ans, int k) {
        return Math.max(findmax(ans,'T',k),findmax(ans,'F',k));
    }
    public int findmax(String ans,char ch,int k){
        int l=0;
        int f=0;
        int maxl=0;
        for(int r=0;r<ans.length();r++){
            if(ans.charAt(r)==ch)f++;
            while(f>k){
                if(ans.charAt(l)==ch){
                    f--;
                }
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}