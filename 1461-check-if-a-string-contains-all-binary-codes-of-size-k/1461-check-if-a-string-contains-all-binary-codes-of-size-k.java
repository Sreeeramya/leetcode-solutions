class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)return false;
        HashSet<String> h1=new HashSet<>();
            h1.add(s.substring(0,k));
        for(int i=1;i<=s.length()-k;i++){
            String str=s.substring(i,i+k);
            if(!h1.contains(str))h1.add(str);
        }
        if(h1.size()==Math.pow(2,k))return true;
        return false;
    }
}