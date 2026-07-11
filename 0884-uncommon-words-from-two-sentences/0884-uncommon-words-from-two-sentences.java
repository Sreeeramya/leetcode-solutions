class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> l1=new ArrayList<>();
        String s[]=s1.split(" ");
        String s3[]=s2.split(" ");
        HashMap<String,Integer> h1=new HashMap<>();
        HashMap<String,Integer> h2=new HashMap<>();
        for(String a:s){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(String a:s3){
            h2.put(a,h2.getOrDefault(a,0)+1);
        }
        for(String b:s){
            if(!h2.containsKey(b) && h1.get(b)==1){
                l1.add(b);
            }
        }
        for(String b:s3){
            if(!h1.containsKey(b) && h2.get(b)==1){
                l1.add(b);
            }
        }
        return l1.toArray(new String[0]);
    }
}