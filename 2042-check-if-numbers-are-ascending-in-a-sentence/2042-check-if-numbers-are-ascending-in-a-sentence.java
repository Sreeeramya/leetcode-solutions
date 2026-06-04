class Solution {
    public boolean areNumbersAscending(String s) {
        int max=0;
        String arr[]=s.split("\\s+");
        for(String s1:arr){
            
            if(s1.matches("\\d+")){
                int a=Integer.parseInt(s1);
                if(a<=max){
                    return false;
                }
                max=a;
            }
        }
        return true;
    }
}