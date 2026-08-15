class Solution {
    public int compress(char[] chars) {
        
        StringBuilder str=new StringBuilder();
        int i=0;
        int j=0;
        int k=0;
        while(j<chars.length){
            int c=0;
            while(j<chars.length && chars[i]==chars[j]){
                c++;
                j++;
            }
            chars[k++]=chars[i];
            if(c>1){
                String b=String.valueOf(c);
                for(char ch:b.toCharArray()){
                    chars[k++]=ch;
                }
            }
            i+=c;
        }
        return k;
    }
}