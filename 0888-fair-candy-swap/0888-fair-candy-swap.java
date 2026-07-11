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
        HashSet<Integer> h1=new HashSet<>();
        for(int b:bobSizes){
            h1.add(b);
        }
        int dif=(sum2-sum1)/2;
        for(int a:aliceSizes){
            if(h1.contains(a+dif)){
                arr[0]=a;
                arr[1]=a+dif;
            }
        }
        return arr;
    }
}