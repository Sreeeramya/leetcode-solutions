class Solution {
    public boolean isSumEqual(String s1, String s2, String s3) {
        HashMap<Character,Integer> h1=new HashMap<>();
        h1.put('a',0);h1.put('b',1);
        h1.put('c',2);h1.put('d',3);
        h1.put('e',4);h1.put('f',5);
        h1.put('g',6);h1.put('h',7);
        h1.put('i',8);h1.put('j',9);

        StringBuilder str1=new StringBuilder();
        for(char ch:s1.toCharArray()){
            if(h1.containsKey(ch)){
                str1.append(h1.get(ch));
            }
        }
        StringBuilder str2=new StringBuilder();
        for(char ch:s2.toCharArray()){
            if(h1.containsKey(ch)){
                str2.append(h1.get(ch));
            }
        }
        StringBuilder str3=new StringBuilder();
        for(char ch:s3.toCharArray()){
            if(h1.containsKey(ch)){
                str3.append(h1.get(ch));
            }
        }
        String f=str1.toString();
        String s=str2.toString();
        String t=str3.toString();
        int i = 0;
        while (i < f.length() && f.charAt(i) == '0') {
            i++;
        }
        f=(i==f.length()) ? "0" : f.substring(i);
        i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        s=(i==s.length()) ? "0" : s.substring(i);
        i = 0;
        while (i < t.length() && t.charAt(i) == '0') {
            i++;
        }
        t=(i==t.length()) ? "0" : t.substring(i);
        return Integer.parseInt(f)+Integer.parseInt(s)==Integer.parseInt(t);
    }
}