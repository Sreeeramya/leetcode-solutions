class Solution {
    public int minBitFlips(int start, int goal) {
        int bits=start^goal;
        int c=0;
        while(bits>0){
            if(bits%2==1){
                c++;
            }
            bits/=2;
        }
        return c;
    }
}