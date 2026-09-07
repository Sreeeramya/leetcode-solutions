class Solution {
    public void solve(int curr,int n,List<Integer> l1){
        if(curr>n){
            return;
        }
        l1.add(curr);
        for(int j=0;j<=9;j++){
            int new_num=curr*10+j;
            if(new_num>n)return;
            solve(new_num,n,l1);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l1=new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(i,n,l1);
        }
        return l1;
    }
}