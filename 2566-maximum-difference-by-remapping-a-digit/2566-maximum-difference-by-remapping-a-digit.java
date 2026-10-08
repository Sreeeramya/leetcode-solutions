class Solution {
    public int minMaxDifference(int num) {
        String s=String.valueOf(num);
        int idx1=-1;
        int idx2=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='9'){
                idx1=i;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                idx2=i;
                break;
            }
        }
        char arr[]=s.toCharArray();
        if(idx1!=-1){
            for(int i=0;i<arr.length;i++){
            if(arr[i]==s.charAt(idx1)){
                arr[i]='9';
            }
        }
        }
        
        int max=Integer.parseInt(new String(arr));
        arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s.charAt(idx2)){
                arr[i]='0';
            }
        }
        int min=Integer.parseInt(new String(arr));
        return max-min;
    }
}