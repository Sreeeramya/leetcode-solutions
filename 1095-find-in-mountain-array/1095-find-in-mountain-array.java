/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(mountainArr.length()>=3){
            int p=find_peak(target,mountainArr);
            int c=bs1(0,p,target,mountainArr);
            int d=bs2(p+1,mountainArr.length()-1,target,mountainArr);
            if(c!=-1 && d!=-1){
                return c;
            }
            else if(c==-1 && d!=-1){
                return d;
            }
            else if(c!=-1 && d==-1){
                return c;
            }
        }
        return -1;
    }
    public int bs1(int a,int b2,int t,MountainArray b ){
        int s=a;
        int e=b2;
        while(s<=e){
            int m=s+(e-s)/2;
            int v=b.get(m);
            if(v==t){
                return m;
            }
            else if(v>t){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
    public int bs2(int c1,int c2,int t,MountainArray b ){
        int s=c1;
        int e=c2;
        while(s<=e){
            int m=s+(e-s)/2;
            int v=b.get(m);
            if(v==t){
                return m;
            }
            else if(v>t){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
    public int find_peak(int target, MountainArray a){
            int s=0;
            int e=a.length()-1;
            while(s<=e){
                int m=s+(e-s)/2;
                
                if(m>0 && m<a.length()-1){
                int val=a.get(m-1);
                int val1=a.get(m);
                int val2=a.get(m+1);
                    if(val1>val && val1>val2){
                        return m;
                    }
                    else if(val>val1){
                        e=m-1;
                    }
                    else{
                        s=m+1;
                    }
                }
                else if(m==0){
                    if(a.get(0)>a.get(1)){
                        return 0;
                    }
                    else{
                        return 1;
                    }
                }
                else if(m==a.length()-1){
                    if(a.get(a.length()-1)>a.get(a.length()-2)){
                        return a.length()-1;
                    }
                    else{
                        return a.length()-2;
                    }
                }
            }
            return -1;
        
    }
}