class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:word1.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> h2=new HashMap<>();
        for(char ch:word2.toCharArray()){
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        if(!(h1.keySet().equals(h2.keySet()))){
            return false;
        }
        int arr1[]=new int[h1.size()];
        int arr2[]=new int[h2.size()];
        int i=0;
        for(int a:h1.values()){
            arr1[i++]=a;
        }
        i=0;
        for(int a:h2.values()){
            arr2[i++]=a;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}