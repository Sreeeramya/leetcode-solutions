class Solution {
    public int[] resultsArray(int[] arr, int k) {
        int n=arr.length;
        int res[]=new int[n-k+1];
        int j=0;
        boolean check=true;
        for(int i=1;i<k;i++){
            if(arr[i]-arr[i-1]!=1)check=false;
            if(check==false){
                res[j++]=-1;
                break;
            }
        }
        if(check){
            res[j++]=arr[k-1];
        }
        int count=1;
        for (int i=1; i<k; i++) {
            if (arr[i]-arr[i - 1]==1) {
                count++;
            } else {
                count=1;
            }
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                count++;
            }
            else{
                count=1;
            }
            if(count>=k){
                res[j++]=arr[i];
            }
            else{
                res[j++]=-1;
            }
        }
        return res;
    }
}