class Solution {
    public int balancedStringSplit(String s) {
        int b=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='L'){
                b++;
            }
            else{
                b--;
            }
            if(b==0){
                ans++;
            }
        }
        return ans;
    }
}