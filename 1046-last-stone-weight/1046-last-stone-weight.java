class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:stones){
            q.add(a);
        }
        while(q.size()>1){
            int y=q.remove();
            int x=q.remove();
            if(x!=y){
                q.add(y-x);
            }
        }
        if(q.size()==1){
            return q.peek();
        }
        return 0;
    }
}