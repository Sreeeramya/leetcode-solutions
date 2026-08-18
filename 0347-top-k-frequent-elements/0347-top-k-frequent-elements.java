class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> p=new PriorityQueue<>(
            (a,b)->{
                int fa=h1.get(a);
                int fb=h1.get(b);
                if(fa!=fb){
                    return Integer.compare(fa,fb);
                }
                return Integer.compare(a,b);
            }
        );
        for(int a:h1.keySet()){
            p.add(a);
            if(p.size()>k){
                p.remove();
            }
        }
        int arr[]=new int[p.size()];
        int i=0;
        while(p.size()>0){
            arr[i++]=p.remove();
        }
        return arr;
    }
}