class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray()){
                if(ch==x){l1.add(i);
                break;}
            }
        }
        return l1;
    }
}