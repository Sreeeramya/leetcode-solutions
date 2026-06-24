class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s1=new Stack<>();
        for(int a:asteroids){
                if(a>0){
                    s1.push(a);
                }
                else{
                    boolean alive=true;
                    while(!s1.isEmpty() && s1.peek()>0){
                    if(Math.abs(a)>s1.peek()){
                    s1.pop();
                    }
                    else if(Math.abs(a)==s1.peek()){
                        s1.pop();
                        alive=false;
                        break;
                    }
                    else{
                        alive=false;
                        break;
                    }
                    }
                    if(alive){
                        s1.push(a);
                    }
                }
        }
        int i=0;
        int arr[]=new int[s1.size()];
        for(int a:s1){
            arr[i++]=a;
        }
        return arr;
    }
}