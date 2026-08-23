class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int n=processorTime.size();
        int m=tasks.size();
        int grps=m/4;
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int max=Integer.MIN_VALUE;
        int p=0;
        for(int i=m-1;i>=0;i--){
            int ans=0;
            if((i+1)%4==0){
                ans+=processorTime.get(p)+tasks.get(i);
                max=Math.max(ans,max);
                p++;
            }

        }
        return max;
    }
}