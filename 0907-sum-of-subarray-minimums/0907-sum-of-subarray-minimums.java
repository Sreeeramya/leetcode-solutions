class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n1=arr.length;
        Stack<Integer> s1=new Stack<>();
        int left[]=new int[n1];
        int right[]=new int[n1];
        for(int i=0;i<n1;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=s1.peek();
            }
            s1.push(i);
        }
        s1.clear();
        for(int i=n1-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                right[i]=n1;
            }
            else{
                right[i]=s1.peek();
            }
            s1.push(i);
        }
        long sum=0;
        long mod = 1000000007;
        for(int i=0;i<n1;i++){
            
            long c=(long)arr[i]*(i-left[i])*(right[i]-i);
            sum=(sum+c)%mod;
        }
        return (int)sum;
    }
}