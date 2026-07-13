class Solution {
    public boolean isCircularSentence(String sentence) {
        int n=sentence.length();
        int c=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                c++;
            }
        }
        if(c==0){
            if(sentence.charAt(0)!=sentence.charAt(n-1)){
                return false;
            }
        }
        else{
            if(sentence.charAt(0)!=sentence.charAt(n-1)){
                return false;
            }
            for(int i=0;i<sentence.length();i++){
            
            if((sentence.charAt(i)==' ') && sentence.charAt(i-1)!=sentence.charAt(i+1)){
                return false;
            }
        }
        }
        
        return true;
    }
}