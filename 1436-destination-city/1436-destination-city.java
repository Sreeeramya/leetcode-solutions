class Solution {
    public String destCity(List<List<String>> paths) {
        String str="";
        HashSet<String> h1=new HashSet<>();
        for(List<String> a:paths){
            h1.add(a.get(0));
        }
        for(List<String> b:paths){
            if(!(h1.contains(b.get(1)))){
                str=b.get(1);
            }
        }
        return str;
        
    }
}