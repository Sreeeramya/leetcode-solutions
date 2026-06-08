class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        int i=0;
        int j=0;
        int id=0;
        Deque<Integer> d1=new LinkedList<>();
        while(j<nums.length){
            while(!d1.isEmpty() && d1.peekLast()<nums[j]){
                d1.pollLast();
            }
            d1.offerLast(nums[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                ans[id++]=d1.peekFirst();
                if(nums[i]==d1.peekFirst()){
                    d1.pollFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}