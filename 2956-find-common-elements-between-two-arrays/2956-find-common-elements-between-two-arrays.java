class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c1=0;
        int c2=0;
        int answer[]=new int[2];
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int a:nums1){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        HashMap<Integer,Integer> h2=new HashMap<>();
        for(int a:nums2){
            h2.put(a,h2.getOrDefault(a,0)+1);
        }
        for(int a:nums1){
            if(h2.containsKey(a)){
                c1++;
            }
        }
        
        for(int a:nums2){
            if(h1.containsKey(a)){
               c2++;
            }
        }
        answer[0]=c1;
        answer[1]=c2;
        return answer;
    }
}