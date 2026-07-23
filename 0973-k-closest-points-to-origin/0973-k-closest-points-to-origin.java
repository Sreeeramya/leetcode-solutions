class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p=new PriorityQueue<>(
            (a,b)->{
                int distA=a[0]*a[0]+a[1]*a[1];
                int distB=b[0]*b[0]+b[1]*b[1];
                return distB-distA;
            }
        );
        for(int p1[]:points){
            p.offer(p1);
        }
        while(!p.isEmpty() && p.size()>k){
            p.poll();
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            int a[]=p.poll();
            ans[i][0]=a[0];
            ans[i][1]=a[1];
        }
        return ans;
    }
}