class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String b=Integer.toBinaryString(n);
        for(char ch:b.toCharArray()){
            if(ch=='1'){
                c++;
            }
        }
        return c;
        // int c=0;
        // while(n>0){
        //     if(n%2==1){
        //         c++;
        //     }
        //     n=n/2;
        // }
        // return c;
    }
}