class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int arr[]=new int[temperatures.length];
        
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                int index=s.pop();
                arr[index]=i-index;
            }
            s.push(i);
        }
        return arr;
    }
}