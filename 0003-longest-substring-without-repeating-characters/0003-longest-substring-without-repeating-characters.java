class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char r=s.charAt(j);
            h1.put(r,h1.getOrDefault(r,0)+1);
            while(h1.size()<j-i+1){
                char l=s.charAt(i);
                h1.put(l,h1.get(l)-1);
                if(h1.get(l)==0){
                    h1.remove(l);
                }
                i++;
            }
            if(h1.size()==j-i+1){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}