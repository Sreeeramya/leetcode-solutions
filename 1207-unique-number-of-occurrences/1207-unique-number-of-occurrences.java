class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:arr){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int a:h1.keySet()){
            h2.add(h1.get(a));
        }
        if(h1.size()==h2.size()){
            return true;
        }
        return false;
    }
}