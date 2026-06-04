class Solution {
    public int maximumValue(String[] strs) {
        int max=-1;
        for(int i=0;i<strs.length;i++){
            if(strs[i].matches("\\d+")){
                max=Math.max(max,Integer.parseInt(strs[i]));
            }
            else{
                max=Math.max(max,strs[i].length());
                
            }
            
        }
        return max;
    }
}