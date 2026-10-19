class Solution {
    public int minimumDifference(int[] arr, int k) {
        Arrays.sort(arr);
        int diff=arr[k-1]-arr[0];
        int min=diff;
        for(int i=1;i<=arr.length-k;i++){
            diff=arr[i+k-1]-arr[i];
            min=Math.min(min,diff);
        }
        return min;
    }
}