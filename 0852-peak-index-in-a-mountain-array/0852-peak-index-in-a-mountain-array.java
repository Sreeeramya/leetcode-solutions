class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m>0 && m<n-1){
                if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                    return m;
                }
                else if(arr[m]<arr[m+1]){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
            else if(m==0){
                if(arr[0]>arr[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(m==n-1){
                if(arr[n-1]>arr[n-2]){
                    return n-1;
                }
                else{
                    return n-2;
                }
            }
        }
        return -1;
    }
}