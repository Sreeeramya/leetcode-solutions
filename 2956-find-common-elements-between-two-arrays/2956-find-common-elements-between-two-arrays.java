class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c1=0;
        int c2=0;
        int answer[]=new int[2];
        HashSet<Integer> h1=new HashSet<>();
        for(int a:nums1){
            h1.add(a);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int a:nums2){
            h2.add(a);
        }
        for(int a:nums1){
            if(h2.contains(a)){
                c1++;
            }
        }
        
        for(int a:nums2){
            if(h1.contains(a)){
               c2++;
            }
        }
        answer[0]=c1;
        answer[1]=c2;
        return answer;
    }
}