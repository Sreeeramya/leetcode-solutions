class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> h1=new HashSet<>();
        List<String> l1=new ArrayList<>();
        if(s.length()<10)return l1;
        h1.add(s.substring(0,10));
        for(int i=1;i<=s.length()-10;i++){
            String str=s.substring(i,i+10);
            if(h1.contains(str)){
                if(!l1.contains(str))l1.add(s.substring(i,i+10));
            }
            h1.add(str);
        }
        return l1;
    }
}