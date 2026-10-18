class Solution {
    public int maxSatisfied(int[] arr, int[] g, int min) {
        int norm=0;
        for(int i=0;i<arr.length;i++){
            if(g[i]==0)norm+=arr[i];
        }
        int extra=0;
        for(int i=0;i<min;i++){
            if(g[i]==1)extra+=arr[i];
        }
        int max_extra=extra;
        for(int i=min;i<arr.length;i++){
            if(g[i-min]==1)extra-=arr[i-min];
            if(g[i]==1)extra+=arr[i];
            max_extra=Math.max(extra,max_extra);
        }
        return norm+max_extra;
    }
}