class Solution {
    public int minFlipsMonoIncr(String s) {
        int one=0;
        int min=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            else{
                if(one>0){
                    one--;
                    min++;
                }
            }
        }
        return min;
    }
}