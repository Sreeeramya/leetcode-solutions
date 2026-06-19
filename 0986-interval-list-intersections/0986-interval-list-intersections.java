class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0;
        int j=0;
        List<int[]> l1=new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            int start=Math.max(firstList[i][0],secondList[j][0]);
            int end=Math.min(firstList[i][1],secondList[j][1]);

            if(start<=end){
                l1.add(new int[]{start,end});
            }
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }
            else if(firstList[i][1]>secondList[j][1]){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return l1.toArray(new int[l1.size()][]);
        
    }
}