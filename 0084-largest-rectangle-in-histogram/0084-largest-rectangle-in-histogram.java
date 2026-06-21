class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];;
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(!s1.isEmpty()){
                left[i]=s1.peek();

            }
            else{
                left[i]=-1;
            }
            s1.push(i);
        }
        s1.clear();
        
        int right[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(!s1.isEmpty()){
                right[i]=s1.peek();
            }
            else{
                right[i]=n;
            }
            s1.push(i);
        }
        int max_area=0;
        for(int j=0;j<n;j++){
            int width=right[j]-left[j]-1;
            int area=heights[j]*width;
            max_area=Math.max(max_area,area);
        }
        return max_area;
    }
}