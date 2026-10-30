class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            String arr[]=s.split("");
            for(int j=0;j<arr.length;j++){
                l1.add(Integer.parseInt(arr[j]));
            }
        }
        int ans[]=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            ans[i]=l1.get(i);
        }
        return ans;
    }
}