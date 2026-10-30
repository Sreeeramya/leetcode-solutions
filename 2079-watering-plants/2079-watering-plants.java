class Solution {
    public int wateringPlants(int[] arr, int cap) {
        int ca=cap;
        int step=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=ca){
                step++;
                ca-=arr[i];
            }
            else if(arr[i]>ca){
                step+=i+(i+1);
                ca=cap;
                ca-=arr[i];
            }
        }
        return step;
    }
}