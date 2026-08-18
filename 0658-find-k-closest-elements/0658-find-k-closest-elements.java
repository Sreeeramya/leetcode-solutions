class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> p=new PriorityQueue<>(
            (a,b)-> {
                int da=Math.abs(a-x);
                int db=Math.abs(b-x);
                if(da!=db){
                    return Integer.compare(db,da);
                }
                return Integer.compare(b,a);
            }
        );
        for(int a:arr){
            p.add(a);
            if(p.size()>k){
                p.remove();
            }
        }
        ArrayList<Integer> a1=new ArrayList<>();
        while(p.size()>0){
            a1.add(p.remove());
        }
        Collections.sort(a1);
        return a1;
    }
}