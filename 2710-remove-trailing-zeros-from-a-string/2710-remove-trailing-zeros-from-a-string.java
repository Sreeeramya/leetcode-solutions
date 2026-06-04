class Solution {
    public String removeTrailingZeros(String num) {
        int r=num.length()-1;
        while(r>=0 && num.charAt(r)=='0'){
            r--;
        }
        return num.substring(0,r+1);
    }
}