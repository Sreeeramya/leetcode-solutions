class Solution {
    public int minSwaps(int[]arr) {
        int n=arr.length;
        int k=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)k++;
        }
        for(int i=0;i<k;i++){
            if(arr[i]==1)c++;
        }
        int max=c;
        for(int i=k;i<n+k-1;i++){
            if(arr[(i-k)%n]==1)c--;
            if(arr[i%n]==1)c++;
            max=Math.max(max,c);
        }
        return k-max;
    }
}