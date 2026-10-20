class Solution {
    public int numberOfAlternatingGroups(int[] arr, int k) {
        int n=arr.length;
        int check=0;
        int c=0;
        for(int i=0;i<k-1;i++){
            if(arr[i]==arr[i+1])check++;
        }
        if(check==0)c++;
        for(int i=k;i<n+k-1;i++){
            if(arr[(i-k)%n]==arr[(i-k+1)%n])check--;
            if(arr[(i-1)%n]==arr[i%n])check++;
            if(check==0)c++;
        }
        return c;
    }
}