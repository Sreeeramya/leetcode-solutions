class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr2[]=new int[arr.length];
        int arr1[]=arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer,Integer> h1=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr1.length;i++){
            
            if(!h1.containsKey(arr1[i])){
                h1.put(arr1[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
           if(h1.containsKey(arr[i])){
            arr2[i]=h1.get(arr[i]);
           } 
        }
        return arr2;
    }
}