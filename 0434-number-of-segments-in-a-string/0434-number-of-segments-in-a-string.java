class Solution {
    public int countSegments(String s) {
        s=s.trim();
        int c=0;
        if(s.length()==0){
            return 0;
        }
        String str1[]=s.split(" ");
        for(int i=0;i<str1.length;i++){
            if(!str1[i].equals("")){
                c+=1;
            }
        }
        return c;
    }
}