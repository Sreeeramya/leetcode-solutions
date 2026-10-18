class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        long sum=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<k;i++){
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
            sum+=arr[i];
        }
        long max_sum=h1.size()==k?sum:0;
        for(int i=k;i<arr.length;i++){
            h1.put(arr[i-k],h1.get(arr[i-k])-1);
            sum-=arr[i-k];
            if(h1.get(arr[i-k])==0)h1.remove(arr[i-k]);
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
            sum+=arr[i];
            if(h1.size()==k)max_sum=Math.max(max_sum,sum);
        }
        return max_sum;
    }
}