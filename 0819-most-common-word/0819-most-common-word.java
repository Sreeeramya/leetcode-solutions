class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String p=paragraph.toLowerCase();
        p=p.replaceAll("[^a-z]"," ");
        String b="";
        String str[]=p.split("\\s+");
        HashMap<String,Integer> h1=new HashMap<>();
        HashSet<String> h2=new HashSet<>();
        for(String a:banned){
            h2.add(a);
        }
        for(String s:str){
            if(!h2.contains(s)){
                h1.put(s,h1.getOrDefault(s,0)+1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(String a:h1.keySet()){
            if(h1.get(a)>max){
                max=Math.max(max,h1.get(a));
            b=a;
            }
            
        }
        return b;
    }
}