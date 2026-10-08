class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> h1=new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                String ans="";
                while(i<word.length() && Character.isDigit(word.charAt(i))){
                    ans+=word.charAt(i);
                    i++;
                }
                ans=ans.replaceFirst("^0+","");
                if(ans=="")ans="0";
                h1.add(ans);
            }
        }
        return h1.size();
    }
}