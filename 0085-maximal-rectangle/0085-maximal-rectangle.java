class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int v[]=new int[n];
        for(int j=0;j<n;j++){
                v[j]=matrix[0][j]-'0';
            }
        
        int max=histogram(v);
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0'){
                    v[j]=0;
                }
                else{
                    v[j]++;
                }
            }
            max=Math.max(max,histogram(v));
        }
        return max;
    }
    public int histogram(int[] arr){
        Stack<Integer> s1=new Stack<>();
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
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
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
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
        int max=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=arr[i]*width;
            max=Math.max(max,area);
        }
        return max;
    }
}