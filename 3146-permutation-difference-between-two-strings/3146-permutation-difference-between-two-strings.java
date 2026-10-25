class Solution {
    public int findPermutationDifference(String s, String t) {
        int c=0;
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h1.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            c+=Math.abs(i-h1.get(t.charAt(i)));
        }
        return c;
    }
}