class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean arr[]=new boolean[128];
        int c=0;
        for(char ch:jewels.toCharArray()){
            arr[ch]=true;
        }
        for(char ch:stones.toCharArray()){
            if(arr[ch]){
                c++;
            }
        }
        return c;
    }
}