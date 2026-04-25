class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<sentences.length;i++){
            int c=0;
            for(int j=0;j<sentences[i].length();j++){
            if(sentences[i].charAt(j)==' '){
                c++;
            }
            }
            max=Math.max(c+1,max);
            
        }
        return max;
    }
}