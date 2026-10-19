class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)return false;
        HashSet<String> h1=new HashSet<>();
        for(int i=0;i<k;i++){
            h1.add(s.substring(i,i+k));
        }
        for(int i=k;i<=s.length()-k;i++){
            String str=s.substring(i,i+k);
            if(!h1.contains(str))h1.add(str);
        }
        if(h1.size()==Math.pow(2,k))return true;
        return false;
    }
}