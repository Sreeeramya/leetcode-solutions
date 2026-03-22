class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s1=new Stack<>();
        int max=0;
        for(int i=0;i<=n;i++){
            int cur_h;
            if(i==n){
                cur_h=0;
            }
            else{
                cur_h=heights[i];
            }
            while(!s1.isEmpty() && cur_h<heights[s1.peek()]){
            int height=heights[s1.pop()];
            int width;
            if(s1.isEmpty()){
                width=i;
            }
            else{
                width=i-s1.peek()-1;
            }
            max=Math.max(max,height*width);
            }
            s1.push(i);
        }
        return max;
    }
}