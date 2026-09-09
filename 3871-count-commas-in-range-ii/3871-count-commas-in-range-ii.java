class Solution {
    public long countCommas(long n) {
        long c=0;
        long start=1000;
        while(start<=n){
            c+=n-start+1;
            start*=1000;
        }
        return c;
    }
}