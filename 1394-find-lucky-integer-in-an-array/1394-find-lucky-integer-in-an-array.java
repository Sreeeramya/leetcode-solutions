class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        int max=Integer.MIN_VALUE;;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:arr){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(int a:h1.keySet()){
            if(h1.get(a)==a && h1.get(a)>=max ){
                max=Math.max(max,h1.get(a));
                ans=a;
            }
        }
        
        return ans;
    }
}