class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:arr){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> p=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        for(Map.Entry<Integer,Integer> a:h1.entrySet()){
            p.offer(a);
        }
        int r=0;
        int d=0;
        while(r<n/2){
            Map.Entry<Integer,Integer> b=p.poll();
            r+=b.getValue();
            d++;
        }
        return d;
    }
}