class Solution {
    public char kthCharacter(long k, int[] operations) {
        if(k==1)return'a';
        int n=operations.length;
        long len=1;
        long newk=-1;
        int op_type=-1;

        for(int i=0;i<n;i++){
            len*=2;
            if(len>=k){
                op_type=operations[i];
                newk=k-len/2;
                break;
            }
        }
        char ch=kthCharacter(newk,operations);
        if(op_type==0){
            return ch;
        }
        else{
            if(ch=='z')return 'a';
            return (char)(ch+1);
        }
    }
}