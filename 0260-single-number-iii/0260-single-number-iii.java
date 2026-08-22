class Solution {
    public int[] singleNumber(int[] nums) {
        int i=0;
        HashSet<Integer> h1=new HashSet<>();
        for(int a:nums){
            if(h1.contains(a)){
                h1.remove(a);
            }
            else{
                h1.add(a);
            }
        }
        int arr[]=new int[2];
        for(int a:h1){
            arr[i++]=a;
        }
        return arr;
    }
}