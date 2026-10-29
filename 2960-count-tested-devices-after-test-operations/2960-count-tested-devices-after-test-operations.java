class Solution {
    public int countTestedDevices(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-c>0)c++;
        }
        return c;
    }
}