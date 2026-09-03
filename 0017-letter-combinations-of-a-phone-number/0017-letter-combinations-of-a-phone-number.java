class Solution {
    public List<String> help(String s,String ans){

        String map[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(s.isEmpty()){
            List<String> l1=new ArrayList<>();
            l1.add(ans);
            return l1;
        }
        int di=s.charAt(0)-'0';
        List<String> l2=new ArrayList<>();
        String letter=map[di-2];
        for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            l2.addAll(help(s.substring(1),ans+ch));
        }
        return l2;
    }
    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();
        l=help(digits,"");
        return l;
    }
}