class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double sum=0;
        int prev=0;
        for(int i=0;i<brackets.length;i++){
            int upper=brackets[i][0];
            int percent=brackets[i][1];
            int amt=Math.min(income,upper)-prev;
            sum+=amt*percent/100.0;
            prev=upper;
            if(upper>=income)break;
        }
        return sum;
    }
}