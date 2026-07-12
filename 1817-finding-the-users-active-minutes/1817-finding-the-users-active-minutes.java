class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> h1=new HashMap<>();
        int arr[]=new int[k];
        for(int []l:logs){
            int user=l[0];
            int min=l[1];
            if(!h1.containsKey(user)){
                h1.put(user,new HashSet<>());
            }
            h1.get(user).add(min);
        }
        for(int a:h1.keySet()){
            int uam=h1.get(a).size();
            arr[uam-1]++;
        }
        return arr;
    }
}