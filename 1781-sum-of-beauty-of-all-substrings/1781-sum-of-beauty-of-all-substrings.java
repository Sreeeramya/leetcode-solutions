class Solution {
    public int beautySum(String s) {
        
        int f=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> h1=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                h1.put(ch,h1.getOrDefault(ch,0)+1);
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
        for(int a:h1.values()){
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        f+=(max-min);
            }
        }
        return f;
    }
}