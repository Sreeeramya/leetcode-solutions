class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
       int i=0;
       int j=0;
       List<Integer> l1=new ArrayList<>();
       HashMap<Character,Integer> h1=new HashMap<>();
       for(char ch:p.toCharArray()){
        h1.put(ch,h1.getOrDefault(ch,0)+1);
       }
       int c=h1.size();
       
       while(j<s.length()){
        char r=s.charAt(j);
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
            char l=s.charAt(i);
            if(c==0){
                l1.add(i);
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
       return l1;
    }
}