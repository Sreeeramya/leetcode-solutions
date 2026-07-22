class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> h1=new HashMap<>();
        for(String a:words){
           h1.put(a,h1.getOrDefault(a,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> p=new PriorityQueue<>(
            (a,b)->{
                if(a.getValue()!=b.getValue()){
                    return b.getValue()-a.getValue();
                }
                else{
                    return a.getKey().compareTo(b.getKey());
                }
            }
        );
        for(Map.Entry<String,Integer> e:h1.entrySet()){
            p.offer(e);
        }
        List<String> s=new ArrayList<>();
        for(int i=0;i<k;i++){
        Map.Entry<String,Integer>val=p.poll();
        String a1=val.getKey();
        s.add(a1);
        }
        return s;
    }
}