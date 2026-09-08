class Solution {
    public int countCommas(int n) {
        long c=0;
        while(n>=1000){
            c+=n-1000+1;
            n/=1000;
        }
        return (int)c;
    }
}