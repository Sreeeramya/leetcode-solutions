class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int arr[]=new int[2];
        int sum1=0;
        int sum2=0;
        for(int a:aliceSizes){
            sum1+=a;
        }
        for(int a:bobSizes){
            sum2+=a;
        }
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(sum1-aliceSizes[i]+bobSizes[j]==sum2-bobSizes[j]+aliceSizes[i]){
                arr[0]=aliceSizes[i];
                arr[1]=bobSizes[j];
            }
            }
            
        }
        return arr;
    }
}