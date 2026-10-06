class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        backtrack(s,0,curr,ans);
        return ans;
    }
    public void backtrack(String s,int start,List<String> curr,List<String> ans){
        if(start==s.length()){
            if(curr.size()==4)ans.add(String.join(".", curr));
            return;
        }
        for(int end=start;end<s.length() && end<start+3;end++){
            String p=s.substring(start,end+1);
            if(valid(p)){
                curr.add(p);
                backtrack(s,end+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean valid(String s){
        if(s.length()>1 && s.charAt(0)=='0')return false;
        int num=Integer.parseInt(s);
        if(num>255)return false;
        return true;
    }
}