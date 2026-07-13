class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            int value=ch-'a'+1;
            str.append(value);
        }
        String s1=str.toString();
        int sum=0;
        for(int i=0;i<k;i++){
            sum=0;
            for(char ch:s1.toCharArray()){
            sum+=ch-'0';
            
        }
        s1=String.valueOf(sum);
        }
        return sum;
    }
}