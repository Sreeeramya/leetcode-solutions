class Solution {
    public int search(int[] nums, int target) {
        int index=find(nums,target);
        int s1=bs(nums,0,index-1,target);
        int s2=bs(nums,index,nums.length-1,target);
        if(s1!=-1 && s2==-1){
            return s1;
        }
        if(s1==-1 && s2!=-1){
            return s2;
        }
        return -1;
    }
    public int bs(int nums[],int i,int j,int t){
        int s=i;
        int e=j;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==t){
                return m;
            }
            else if(nums[m]>t){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
    public int find(int arr[],int t){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[s]<=arr[e]){
                return s;
            }
            if(arr[m]>arr[e]){
                s=m+1;
            }
            else if(arr[m]<=arr[e]){
                e=m;
            }
        }
        return -1;
    }
}