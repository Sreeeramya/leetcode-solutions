class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c_five=0;
        int c_ten=0;
        int c_twenty=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                c_five++;
            }
            else if(bills[i]==10){
                c_ten++;
                if(c_five>0)c_five--;
                else return false;
            }
            else if(bills[i]==20){
                c_twenty++;
                if(c_five>0 && c_ten>0){
                    c_five--;
                    c_ten--;
                }
                else if(c_five>=3)c_five-=3;
                else return false;
            }
        }
        return true;
    }
}