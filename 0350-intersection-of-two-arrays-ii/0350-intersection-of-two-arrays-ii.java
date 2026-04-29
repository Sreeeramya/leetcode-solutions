class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int a:nums1){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        for(int b:nums2){
            if(h1.containsKey(b) && h1.get(b)>0){
                l2.add(b);
                h1.put(b,h1.get(b)-1);
            }
        }
        int arr1[]=new int[l2.size()];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=l2.get(i);
        }
        return arr1;
    }
}