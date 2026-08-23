class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length/2;
        int total=0;
        int diff[]=new int[costs.length];
        for(int i=0;i<costs.length;i++){
            total+=costs[i][0];
            diff[i]=costs[i][1]-costs[i][0];
        }
        Arrays.sort(diff);
        for(int i=0;i<n;i++){
            total+=diff[i];
        }
        return total;
    }
}