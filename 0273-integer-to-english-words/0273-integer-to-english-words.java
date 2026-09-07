class Solution {
    HashMap<Integer,String> below_ten=new HashMap<>();
     HashMap<Integer,String> below_twenty=new HashMap<>();
     HashMap<Integer,String> below_hundred=new HashMap<>();
    public String numberToWords(int num) {
        
        below_ten.put(0,"");
        below_ten.put(1,"One");
        below_ten.put(2,"Two");
        below_ten.put(3,"Three");
        below_ten.put(4,"Four");
        below_ten.put(5,"Five");
        below_ten.put(6,"Six");
        below_ten.put(7,"Seven");
        below_ten.put(8,"Eight");
        below_ten.put(9,"Nine");

        below_twenty.put(10,"Ten");
        below_twenty.put(11,"Eleven");
        below_twenty.put(12,"Twelve");
        below_twenty.put(13,"Thirteen");
        below_twenty.put(14,"Fourteen");
        below_twenty.put(15,"Fifteen");
        below_twenty.put(16,"Sixteen");
        below_twenty.put(17,"Seventeen");
        below_twenty.put(18,"Eighteen");
        below_twenty.put(19,"Nineteen");

        below_hundred.put(2,"Twenty");
        below_hundred.put(3,"Thirty");
        below_hundred.put(4,"Forty");
        below_hundred.put(5,"Fifty");
        below_hundred.put(6,"Sixty");
        below_hundred.put(7,"Seventy");
        below_hundred.put(8,"Eighty");
        below_hundred.put(9,"Ninety");

        if(num==0)return "Zero";
        return solve(num);
    }
    public String solve(int num){
        if(num<10){
            return below_ten.get(num);
        }
        if(num<20){
            return below_twenty.get(num);
        }
        if(num<100){
            String res=below_hundred.get(num/10);
            if(num%10!=0){
            res=res+" "+solve(num%10);
            }
            return res;
        }
        if(num<1000){
            String res=below_ten.get(num/100)+" Hundred";
            if(num%100!=0){
            res=res+" "+solve(num%100);
            }
            return res;
        }
        if(num<1000000){
            String res=solve(num/1000)+" Thousand";
            if(num%1000!=0){
            res=res+" "+solve(num%1000);
            }
            return res;
        }
        if(num < 1000000000){
            String res = solve(num / 1000000) + " Million";
            if(num % 1000000 != 0){
                res = res + " " + solve(num % 1000000);
            }
            return res;
        }
        String res = solve(num / 1000000000) + " Billion";
        if(num % 1000000000 != 0){
            res = res + " " + solve(num % 1000000000);
}

return res;
    }
}