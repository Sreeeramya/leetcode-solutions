class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[(i+1)%n] && arr[(i+1)%n]!=arr[(i+2)%n]){
                c++;
            }
        }
        return c;
    }
}