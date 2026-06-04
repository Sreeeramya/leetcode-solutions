class Solution {
    public int secondHighest(String s) {
        int max=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) && Integer.parseInt(String.valueOf(ch))>max){
                max=Math.max(max,Integer.parseInt(String.valueOf(ch)));
            }
        }
        int max2=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) && Integer.parseInt(String.valueOf(ch))<max && Integer.parseInt(String.valueOf(ch))>max2 ){
                max2=Math.max(max2,Integer.parseInt(String.valueOf(ch)));
            }
        }
        return max2;
    }
}