class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->Integer.compare(b[0]*b[0]+b[1]*b[1],a[0]*a[0]+a[1]*a[1]));
        for(int a[]:points){
            p.add(a);
            if(p.size()>k){
                p.remove();
            }
        }
        int arr[][]=new int[k][2];
        int i=0;
        while(p.size()>0){
            int arr1[]=p.remove();
            arr[i++]=arr1;
        }
        return arr;
    }
}