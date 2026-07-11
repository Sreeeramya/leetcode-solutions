class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h1.put(arr[i],i);
        }
        for(int j=0;j<arr.length;j++){
            int val=2*arr[j];
            if(h1.containsKey(val) && h1.get(val)!=j){
                return true;
            }
        }
        return false;
    }
}