class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        long ones=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                ones++;
            }
            else{
                ans+=ones;
            }
        }
        return ans;
    }
}