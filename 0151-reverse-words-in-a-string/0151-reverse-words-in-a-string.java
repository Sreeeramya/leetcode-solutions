class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        
        StringBuilder s1=new StringBuilder();
        String arr[]=s.split("\\s+");
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
            
            s1.append(arr[i]);
            if(i!=0){
                s1.append(" ");
            }
            
        }
        return s1.toString();
    }
}