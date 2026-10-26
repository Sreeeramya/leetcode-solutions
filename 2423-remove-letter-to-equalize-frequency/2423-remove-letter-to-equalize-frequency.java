class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:word.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:h1.keySet()){
            h1.put(ch,h1.get(ch)-1);
            int freq=-1;
            boolean eq=true;
            for(int f:h1.values()){
                if(f==0)continue;
                if(freq==-1)freq=f;
                else if(freq!=f){
                    eq=false;
                    break;
                }
            }
            if(eq)return true;
            h1.put(ch,h1.get(ch)+1);
        }
        return false;
    }
}