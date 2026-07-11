class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> h=new HashSet<>();
        for(int a:candyType){
            h.add(a);
        }
        if(h.size()>=n/2){
            return n/2;
        }
        return h.size();
    }
}