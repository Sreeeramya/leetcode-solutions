class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<Integer> s1=new Stack<>();
        int n1=nums.length;
        int left[]=new int[n1];
        int right[]=new int[n1];
        for(int i=0;i<n1;i++){
            while(!s1.isEmpty() && nums[s1.peek()]>nums[i]){
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
            while(!s1.isEmpty() && nums[s1.peek()]>=nums[i]){
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
        long sum_m=0;
        for(int i=0;i<n1;i++){
            sum_m+=(long)nums[i]*(i-left[i])*(right[i]-i);
        }
        s1.clear();
        int l1[]=new int[n1];
        int r1[]=new int[n1];
        for(int i=0;i<n1;i++){
            while(!s1.isEmpty() && nums[s1.peek()]<nums[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                l1[i]=-1;
            }
            else{
                l1[i]=s1.peek();
            }
            s1.push(i);
        }
        s1.clear();
         for(int i=n1-1;i>=0;i--){
            while(!s1.isEmpty() && nums[s1.peek()]<=nums[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                r1[i]=n1;
            }
            else{
                r1[i]=s1.peek();
            }
            s1.push(i);
        }
        long sum_max=0;
        for(int i=0;i<n1;i++){
            sum_max+=(long)nums[i]*(i-l1[i])*(r1[i]-i);
        }
        long total=sum_max-sum_m;
        return total;
    }
}