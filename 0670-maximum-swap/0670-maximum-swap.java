class Solution {
    public int maximumSwap(int num) {
        String s=String.valueOf(num);
        int max_index=s.length()-1;
        char arr[]=s.toCharArray();
        int j=-1;
        int k=-1;
        for(int i=s.length()-2;i>=0;i--){
            if(arr[i]>arr[max_index]){
                max_index=i;
            }
            else if(arr[i]<arr[max_index]){
                j=i;
                k=max_index;
            }
        }
        if(j!=-1){
            char ch=arr[j];
        arr[j]=arr[k];
        arr[k]=ch;
        }
        
        return Integer.parseInt(new String(arr));
    }
}