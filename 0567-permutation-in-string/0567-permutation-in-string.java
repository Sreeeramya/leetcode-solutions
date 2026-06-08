class Solution {
    public boolean checkInclusion(String s1, String s2) {

         HashMap<Character,Integer> h1=new HashMap<>();
         for(char ch:s1.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
         }
        int i=0;
        int j=0;
        int c=h1.size();
        int k=s1.length();
        while(j<s2.length()){
            char r=s2.charAt(j);
            if(h1.containsKey(r)){
                h1.put(r,h1.get(r)-1);
                if(h1.get(r)==0){
                    c--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                char l=s2.charAt(i);
                if(c==0){
                    return true;
                }
                if(h1.containsKey(l)){
                    if(h1.get(l)==0){
                        c++;
                    }
                    h1.put(l,h1.get(l)+1);
                }
                i++;
                j++;
            }
        }
        return false;
    }
}