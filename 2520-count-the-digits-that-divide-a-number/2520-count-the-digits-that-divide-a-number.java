class Solution {
    public int countDigits(int num) {
        int c=0;
        int temp=num;
        while(num>0){
            int d=num%10;
            if(temp%d==0)c++;
            num=num/10;
        }
        return c;
    }
}