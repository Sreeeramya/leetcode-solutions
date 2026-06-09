class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(j<fruits.length){
            int a=fruits[j];
            h1.put(a,h1.getOrDefault(a,0)+1);
            while(h1.size()>2){
                int l=fruits[i];
                h1.put(l,h1.get(l)-1);
                if(h1.get(l)==0){
                    h1.remove(l);
                }
                i++;
            }
            
                max=Math.max(j-i+1,max);
            
            j++;
        }
        return max;
    }
}