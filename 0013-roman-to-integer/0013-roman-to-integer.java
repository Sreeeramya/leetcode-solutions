class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        int sum=0;
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        for(int i=0;i<s.length();i++){
            int cur=h1.get(s.charAt(i));
            if(i<s.length()-1 && cur<h1.get(s.charAt(i+1))){
                sum-=cur;
            }
            else{
                sum+=cur;
            }
        }
        return sum;
    }
}