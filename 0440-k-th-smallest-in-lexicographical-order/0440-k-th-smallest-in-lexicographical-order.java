class Solution {
    public int count(long curr,long next,int n){
        int c=0;
        while(curr<=n){
            c+=(next-curr);
            curr*=10;
            next*=10;
            next=Math.min(next,(long)n+1);
        }
        return c;
    }
    public int findKthNumber(int n, int k) {
        long curr=1;
        k-=1;
        
        while(k>0){
            int count_num=count(curr,curr+1,n);
            if(count_num<=k){
                curr++;
                k-=count_num;
            }
            else{
                curr*=10;
                k-=1;
            }
        }
        return (int)curr;
    }
}