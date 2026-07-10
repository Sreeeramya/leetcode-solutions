class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        for(int a:nums1){
            h1.add(a);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int a:nums2){
            h2.add(a);
        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int a:h1){
            if(!h2.contains(a)){
                l1.add(a);
            }
        }
        for(int a:h2){
            if(!h1.contains(a)){
                l2.add(a);
            }
        }
        List<List<Integer>> l3=new ArrayList<>();
        l3.add(l1);
        l3.add(l2);
        return l3;
    }
}