class Solution {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> h1=new HashSet<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            h2.put(ch,i);
        }
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(h1.contains(ch)){
                continue;
            }
            while(!s1.isEmpty()){
                if(s1.peek()>ch && h2.get(s1.peek())>i){
                    h1.remove(s1.peek());
                    s1.pop();
                }
                else{
                    break;
                }
            }
            
                s1.push(ch);
                h1.add(ch);
            
        }
        StringBuilder str=new StringBuilder();
        for(char ch:s1){
            str.append(ch);
        }
        return str.toString();
    }
}