class Solution {
    public void print(int arr[],int t,int idx,int sum,ArrayList<Integer>l2,List<List<Integer>>l1){
        if(sum==t){l1.add(new ArrayList<>(l2));
        return;}
        if(idx==arr.length || sum>t){
            return;
        }
        l2.add(arr[idx]);
        print(arr,t,idx,sum+arr[idx],l2,l1);
        l2.remove(l2.size()-1);
        print(arr,t,idx+1,sum,l2,l1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l1=new ArrayList<>();
        print(candidates,target,0,0,new ArrayList<>(),l1);
        return l1;
    }
}