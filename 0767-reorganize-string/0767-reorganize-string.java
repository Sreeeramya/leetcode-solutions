class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> p=new PriorityQueue<>(
            (a,b)->h1.get(b)-h1.get(a)
        );
        for(char ch:h1.keySet()){
            p.offer(ch);
        }
        StringBuilder str=new StringBuilder();
        char prev='#';
        int prev_f=0;
        while(!p.isEmpty()){
            char ch=p.poll();
            str.append(ch);
            h1.put(ch,h1.get(ch)-1);
            if(prev_f>0){
                p.offer(prev);
            }
            prev=ch;
            prev_f=h1.get(ch);
        }
        if(str.length()!=s.length()){
            return "";
        }
        return str.toString();
    }
}