class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:t.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        int c=h1.size();
        while(j<s.length()){
            char r=s.charAt(j);
            if(h1.containsKey(r)){
                h1.put(r,h1.get(r)-1);
                if(h1.get(r)==0){
                    c--;
                }
                while(c==0){
                    if(j-i+1<min){
                        min=j-i+1;
                        start=i;
                    }
                    char l=s.charAt(i);
                    if(h1.containsKey(l)){
                        h1.put(l,h1.get(l)+1);
                        if(h1.get(l)>0){
                        c++;
                    }
                    }
                    
                   
                    i++;
                }
            }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+min);
    }
}