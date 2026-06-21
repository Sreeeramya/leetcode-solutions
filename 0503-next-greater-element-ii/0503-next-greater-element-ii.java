class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        Stack<Integer> s1=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!s1.isEmpty() && s1.peek()<=nums[i%n]){
                s1.pop();
            }
            if(i<n){
                if(s1.isEmpty()){
                    a[i]=-1;
                }
                else{
                    a[i]=s1.peek();
                }
            }
            s1.push(nums[i%n]);
        }
        return a;
    }
}