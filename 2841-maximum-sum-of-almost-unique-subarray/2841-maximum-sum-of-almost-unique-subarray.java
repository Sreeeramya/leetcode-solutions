class Solution {
    public long maxSum(List<Integer>arr, int m, int k) {
        long sum=0;
        long max=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<k;i++){
            h1.put(arr.get(i),h1.getOrDefault(arr.get(i),0)+1);
            sum+=arr.get(i);
        }
        if(h1.size()>=m)max=sum;
        for(int i=k;i<arr.size();i++){
            sum-=arr.get(i-k);
            h1.put(arr.get(i-k),h1.get(arr.get(i-k))-1);
            if(h1.get(arr.get(i-k))==0)h1.remove(arr.get(i-k));
            sum+=arr.get(i);
            h1.put(arr.get(i),h1.getOrDefault(arr.get(i),0)+1);
            if(h1.size()>=m)max=Math.max(max,sum);
        }
        return max;
    }
}