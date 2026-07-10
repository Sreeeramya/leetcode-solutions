class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int ab=0;
        for(int a:arr1){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }
        int arr[]=new int[arr1.length];
        int i=0;
        for(int b:arr2){
            if(h1.containsKey(b)){
                int freq=h1.get(b);
                for(int j=0;j<freq;j++){
                    arr[i++]=b;
                }
            }
            h1.remove(b);
        }
        int m[]=new int[arr1.length-i];
        for(int a:h1.keySet()){
            int freq=h1.get(a);
            for(int j=0;j<freq;j++){
                m[ab++]=a;
            }
        }
        Arrays.sort(m);
        for(int h=0;h<m.length;h++){
            arr[i++]=m[h];
        }
        return arr;
    }
}