class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return str;
                }
            }
            str+=ch;
        }
        return str;
    }
}