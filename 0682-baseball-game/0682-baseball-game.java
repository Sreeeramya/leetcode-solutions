class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1=new Stack<>();
        for(String a:operations){
            if(a.equals("C")){
                s1.pop();
            }
            else if(a.equals("D")){
                s1.push(s1.peek()*2);
            }
            else if(a.equals("+")){
                int l=s1.pop();
                int sl=s1.peek();
                s1.push(l);
                s1.push(l+sl);
            }
            else{
                s1.push(Integer.parseInt(a));
            }
        }
        int sum=0;
        for(int a:s1){
            sum+=a;
        }
        return sum;
    }
}