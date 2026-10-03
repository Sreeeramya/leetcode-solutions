class Solution {
    static int max;
    public int maxLengthBetweenEqualCharacters(String s) {
        max=-1;
        char arr[]=s.toCharArray();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:arr){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:h1.keySet()){
            if(h1.get(ch)>=2){
                find_long(arr,ch);
            }
        }
        return max;
    }
    public void find_long(char arr[],char ch){
        int f=-1;
        int s=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                if(f==-1){
                    f=i;
                }
                else{
                    s=i;
                }
            }
        }
        if(f!=-1 && s!=-1)max=Math.max(max,s-f-1);
    }
}