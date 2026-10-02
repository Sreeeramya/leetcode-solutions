class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        boolean check[]=new boolean[arr.length];
        permutation(arr,check,ans,a);
        return ans;
    }
    public void permutation(int arr[],boolean check[],List<List<Integer>> ans,List<Integer> a){
        int n=arr.length;
        if(a.size()==n){
            if (!ans.contains(a))ans.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<n;i++){
            if(check[i]==false){
                a.add(arr[i]);
                check[i]=true;
                permutation(arr,check,ans,a);
                a.remove(a.size()-1);
                check[i]=false;
            }
        }
    }
}
    
    
