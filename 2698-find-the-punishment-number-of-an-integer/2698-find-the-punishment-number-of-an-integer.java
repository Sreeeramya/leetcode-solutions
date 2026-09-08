class Solution {
    public boolean check(String sq,int n,int i,int c_sum){
        if(i==sq.length())return c_sum==n;
        int num=0;
        for(int j=i;j<sq.length();j++){
            num=num*10+(sq.charAt(j)-'0');
            if(check(sq,n,j+1,c_sum+num)){
                return true;
            }
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            String s=String.valueOf(sq);
            if(check(s,i,0,0)){
                res+=sq;
            }
        }
        return res;
    }
}