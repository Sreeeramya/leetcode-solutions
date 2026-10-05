class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean val1=true;
        boolean val2=true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]-'a'<arr2[i]-'a'){
            val1=false;
            break;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr2[i]-'a'<arr1[i]-'a'){
            val2=false;
            break;
            }
        }
        return val1||val2;
    }
}