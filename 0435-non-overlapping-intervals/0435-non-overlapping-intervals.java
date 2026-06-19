class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int []prev=intervals[0];
        int c=0;
        for(int i=1;i<intervals.length;i++){
            int[]curr=intervals[i];
            if(prev[1]>curr[0]){
                    c++;
                    if(prev[1]>curr[1]){
                        prev=curr;
                    }
            }
            else{
                prev=curr;
            }
        }
        return c;
    }
}