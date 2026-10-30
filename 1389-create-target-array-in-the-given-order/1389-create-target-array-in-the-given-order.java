class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l1=new ArrayList<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            l1.add(index[i],nums[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
}