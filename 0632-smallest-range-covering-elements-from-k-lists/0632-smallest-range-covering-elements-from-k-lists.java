class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        int max=Integer.MIN_VALUE;
        int ans[]=new int[2];
        for(int i=0;i<nums.size();i++){
            int arr[]=new int[3];
            arr[0]=nums.get(i).get(0);
            arr[1]=i;
            arr[2]=0;
            p.add(arr);
            max=Math.max(max,arr[0]);
        }
        ans[0]=p.peek()[0];
        ans[1]=max;
        while(true){
            int curr[]=p.remove();
            int row=curr[1];
            int col=curr[2];
            if(col+1>=nums.get(row).size()){
                break;
            }
            int next=nums.get(row).get(col+1);
            p.add(new int[]{next,row,col+1});
            max=Math.max(max,next);
            int curr_min=p.peek()[0];
            if(max-curr_min<ans[1]-ans[0] ||(max-curr_min==ans[1]-ans[0] && curr_min<ans[0])){
                ans[0]=curr_min;
                ans[1]=max;
            }
        }
        return ans;
    }
}