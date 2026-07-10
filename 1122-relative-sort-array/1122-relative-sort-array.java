class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int c=0;
        LinkedHashMap<Integer,Integer> h1=new LinkedHashMap<>();
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
                    c++;
                }
            }
            h1.remove(b);
        }
        HashMap<Integer,Integer> h2=new HashMap<>();
        
        for(int a:h1.keySet()){
            h2.put(a,h1.get(a));
        }
        int m[]=new int[arr1.length-c];
        for(int a:h2.keySet()){
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