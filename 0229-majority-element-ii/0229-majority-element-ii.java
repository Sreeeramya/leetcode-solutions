class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer> l1=new ArrayList<>();
        // int n=nums.length;
        // HashMap<Integer,Integer> h1=new HashMap<>();
        // for(int a:nums){
        //     h1.put(a,h1.getOrDefault(a,0)+1);
        // }
        // for(int a:h1.keySet()){
        //     if(h1.get(a)>n/3){
        //         l1.add(a);
        //     }
        // }
        // return l1;

        List<Integer> l1=new ArrayList<>();
        int n=nums.length;
        int candidate1=0;
        int candidate2=0;
        int c1=0;
        int c2=0;
        for(int a:nums){
            if(a==candidate1){
                c1++;
            }
            else if(a==candidate2){
                c2++;
            }
            else if(c1==0){
                candidate1=a;
                c1=1;
            }
            else if(c2==0){
                candidate2=a;
                c2=1;
            }
            
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int a:nums){
            if(a==candidate1){
                c1++;
            }
            else if(a==candidate2){
                c2++;
            }
        }
        if(c1>n/3){
            l1.add(candidate1);
        }
        if(c2>n/3){
            l1.add(candidate2);
        }
        return l1;
    }
}