class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h1=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            h1.putIfAbsent(str,new ArrayList<>());
            h1.get(str).add(s);
        }
        return new ArrayList<>(h1.values());
    }
}