class Solution {
    public int find(int n,int c){
        if(n==0)return c;
        if(n%2==0){
            c++;
            return find(n/2,c);
        }
            c++;
            return find(n-1,c);
    }  
    public int numberOfSteps(int num) {
        return find(num,0);
    }
}