class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        Stack <Integer> s1=new Stack<>();
        int i=nums2.length-1;
        int n2=nums2.length;
        while(i>=0){
            if(!s1.isEmpty()){
                while(!s1.isEmpty() && !(s1.peek()>nums2[i])){
                    s1.pop();
                }
                if(!s1.isEmpty() && s1.peek()>nums2[i]){
                    h1.put(nums2[i],s1.peek());
                    s1.push(nums2[i]);
                    i--;
                }
            }
            if(s1.isEmpty()|| i==n2-1){
                h1.put(nums2[i],-1);
                s1.push(nums2[i]);
                i--;
            }
        }
        int ans[]=new int[nums1.length];
        int j=0;
        for(int a:nums1){
            if(h1.containsKey(a)){
                ans[j]=h1.get(a);
                j++;
            }
        }
        return ans;
    }
}