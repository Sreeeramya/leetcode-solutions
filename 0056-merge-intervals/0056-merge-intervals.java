class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        List<int[]> l1=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        l1.add(intervals[0]);
        for(int i=1;i<n;i++){
            int last[]=l1.get(l1.size()-1);
            if(intervals[i][0]<=last[1]){
                last[1]=Math.max(last[1],intervals[i][1]);
            }
            else{
                l1.add(intervals[i]);
            }
        }
        return l1.toArray(new int[l1.size()][]);
    }
}