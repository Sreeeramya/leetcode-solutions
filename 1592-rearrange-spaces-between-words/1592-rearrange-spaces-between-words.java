class Solution {
    public String reorderSpaces(String text) {
        int c=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                c++;
            }
        }
        text=text.trim();
        String arr[]=text.split("\\s+");
        int n=arr.length;
       
        StringBuilder s1=new StringBuilder();
        if(n==1){
            s1.append(arr[0]);
            s1.append(" ".repeat(c));
            return s1.toString();
        }
        int g=c/(n-1);
        int r=c%(n-1);
        for(int i=0;i<arr.length-1;i++){
            s1.append(arr[i]);
            s1.append(" ".repeat(g));
        }
        s1.append(arr[n-1]);
        s1.append(" ".repeat(r));
        return s1.toString();
    }
}