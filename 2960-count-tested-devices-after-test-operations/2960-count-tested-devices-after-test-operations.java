class Solution {
    public int countTestedDevices(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0)continue;
            if(arr[i]>0)c++;
            for(int j=i+1;j<arr.length;j++){
                arr[j]=Math.max(0,arr[j]-1);
            }
        }
        if(arr[arr.length-1]>0)c++;
        return c;
    }
}