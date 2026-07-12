class Solution {
    public String capitalizeTitle(String title) {
        String s[]=title.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].length()<=2){
                s[i]=s[i].toLowerCase();
            }
            else{
                s[i]=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1).toLowerCase();
            }
        }
        StringBuilder str=new StringBuilder();
        for(String a:s){
            str.append(a).append(" ");
        }
        return str.toString().trim();
    }
}