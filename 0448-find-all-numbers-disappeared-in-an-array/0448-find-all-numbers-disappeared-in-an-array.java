class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int x:nums){
            h1.add(x);
        }
        for(int i=1;i<=nums.length;i++){
            if(!h1.contains(i)){
                l1.add(i);
            }
        }
        return l1;
    }
}