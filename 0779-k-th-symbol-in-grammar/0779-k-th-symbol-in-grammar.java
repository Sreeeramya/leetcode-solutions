class Solution {
    public int kthGrammar(int n, int k) {
        int l=(int)Math.pow(2,n-1);
        int m=l/2;
        if(n==1 && k==1)return 0;
        if(k<=m)return kthGrammar(n-1,k);
        return 1-kthGrammar(n-1,k-m);
    }
}