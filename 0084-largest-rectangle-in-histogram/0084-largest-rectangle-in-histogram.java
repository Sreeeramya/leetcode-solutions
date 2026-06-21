class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];;
        Stack<Integer> s1=new Stack<>();
        int i=0;
        while(i<=n-1){
            while(!s1.isEmpty() && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(!s1.isEmpty()){
                left[i]=s1.peek();

            }
            if(s1.isEmpty()){
                left[i]=-1;
            }
            s1.push(i);
            i++;
        }
        s1.clear();
        i=n-1;
        int right[]=new int[n];
        while(i>=0){
            while(!s1.isEmpty() && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(!s1.isEmpty()){
                right[i]=s1.peek();
            }
            if(s1.isEmpty()){
                right[i]=n;
            }
            s1.push(i);
            i--;
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