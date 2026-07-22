class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int i=0;
        int ans[]=new int[k];
        for(int a:nums){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> p=new PriorityQueue<>(
            (a,b)->h1.get(a)-h1.get(b)
        );
        for(int a:h1.keySet()){
            p.offer(a);
            if(p.size()>k){
                p.poll();
            }
        }
        for(int a:p){
            ans[i]=a;
            i++;
        }
        return ans;
    }
}