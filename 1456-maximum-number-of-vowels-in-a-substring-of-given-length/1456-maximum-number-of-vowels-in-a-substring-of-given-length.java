class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> h1=new HashSet<>();
        h1.add('a');
        h1.add('e');
        h1.add('i');
        h1.add('o');
        h1.add('u');
        int c=0;
        for(int i=0;i<k;i++){
            if(h1.contains(s.charAt(i)))c++;
        }
        int max=c;
        
        for(int i=k;i<s.length();i++){
            char ch1=s.charAt(i-k);
            if(h1.contains(ch1))c--;
            char ch2=s.charAt(i);
            if(h1.contains(ch2))c++;
            max=Math.max(max,c);
        }
        return max;
    }
}