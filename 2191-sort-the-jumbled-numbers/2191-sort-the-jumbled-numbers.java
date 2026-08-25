class Solution {
    public int convert(int n,int arr[]){
        String s=String.valueOf(n);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            str.append(arr[d]);
        }
        int a=Integer.parseInt(str.toString());
        return a;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int arr1[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            
            arr1[i][0]=nums[i];
            arr1[i][1]=convert(nums[i],mapping);
        }
        Arrays.sort(arr1,(a,b)->Integer.compare(a[1],b[1]));
        for(int i=0;i<nums.length;i++){
            nums[i]=arr1[i][0];
        }
        return nums;
    }
}