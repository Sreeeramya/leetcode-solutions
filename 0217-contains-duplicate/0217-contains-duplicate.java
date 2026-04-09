class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s1=new HashSet<>();
        for(int x:nums){
            if(s1.contains(x)){
                return true;
            }
            else{
                s1.add(x);
            }
        }
        return false;
    }
}