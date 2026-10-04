class Solution {
    public boolean isSumEqual(String s1, String s2, String s3) {

        StringBuilder str1=new StringBuilder();
        for(char ch:s1.toCharArray()){
                str1.append(ch-'a');
        }
        StringBuilder str2=new StringBuilder();
        for(char ch:s2.toCharArray()){
                str2.append(ch-'a');
        }
        StringBuilder str3=new StringBuilder();
        for(char ch:s3.toCharArray()){
                str3.append(ch-'a');
        }
        return Integer.parseInt(str1.toString())+Integer.parseInt(str2.toString())==Integer.parseInt(str3.toString());
    }
}