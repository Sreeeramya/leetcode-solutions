class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l1=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            l1.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        l1.add(newInterval);
        while(i<n){
            l1.add(intervals[i]);
            i++;
        }
        return l1.toArray(new int[l1.size()][]);
    }
}