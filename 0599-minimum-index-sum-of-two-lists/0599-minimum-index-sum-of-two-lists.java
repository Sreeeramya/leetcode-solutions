class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        ArrayList<String> l1=new ArrayList<>();
        HashMap<String,Integer> h2=new HashMap<>();
        for(int i=0;i<list2.length;i++){
            h2.put(list2[i],i);
        }
        for(int i=0;i<list1.length;i++){
            if(h2.containsKey(list1[i])){
                sum=(i+h2.get(list1[i]));
                if(sum<min){
                    min=sum;
                    l1.clear();
                    l1.add(list1[i]);
                }
                else if(sum==min){
                    l1.add(list1[i]);
                }
            }
        }
        return l1.toArray(new String[0]);
    }
}