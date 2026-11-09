class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0;
        HashMap<List<Integer>,Integer> h1=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> l1=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                l1.add(grid[i][j]);
            }
            h1.put(l1,h1.getOrDefault(l1,0)+1);
        }

        for(int j=0;j<grid[0].length;j++){
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<grid.length;i++){
                l1.add(grid[i][j]);
            }
            ans+=h1.getOrDefault(l1,0);
        }
        return ans;
    }
}