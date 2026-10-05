class Solution {
    public String sortString(String s) {
        int arr[]=new int[26];
        int r=s.length();
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        while(r>0){
            for(int i=0;i<26;i++){
            if(arr[i]>0){
                str.append((char)('a'+i));
                arr[i]--;
                r--;
            }
        }
        for(int i=25;i>=0;i--){
            if(arr[i]>0){
                str.append((char)('a'+i));
                arr[i]--;
                r--;
            }
        }
        }
        return str.toString();
    }
}