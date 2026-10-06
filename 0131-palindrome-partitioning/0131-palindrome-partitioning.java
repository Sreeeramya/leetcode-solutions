class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        backtrack(s,0,curr,ans);
        return ans;
    }
    public void backtrack(String s,int start,List<String> curr,List<List<String>> ans){
        if(start==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(palin(s,start,end)){
                curr.add(s.substring(start,end+1));
                backtrack(s,end+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean palin(String s,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}