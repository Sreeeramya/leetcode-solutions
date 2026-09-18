/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    long max;
    long min;
    Pair(long max,long min){
        this.max=max;
        this.min=min;
    }
 }
class Solution {
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        // boolean val=true;
        // ArrayList<Integer> l1=new ArrayList<>();
        // find(root,l1);
        // for(int i=1;i<l1.size();i++){
        //     if(l1.get(i)<=l1.get(i-1)){
        //         val=false;
        //         break;
        //     }
        // }
        // return val;
        flag=true;
        maxmin(root);
        return flag;
    }
    public Pair maxmin(TreeNode root){
        if(root==null)return new Pair(Long.MIN_VALUE,Long.MAX_VALUE);
        Pair lst=maxmin(root.left);
        Pair rst=maxmin(root.right);
        long mx=Math.max(root.val,Math.max(lst.max,rst.max));
        long mn=Math.min(root.val,Math.min(lst.min,rst.min));
        if(lst.max>=root.val || rst.min<=root.val)flag=false;
        return new Pair(mx,mn);
    }
    // public void find(TreeNode root,ArrayList<Integer> l1){
    //     if(root==null)return;
    //     find(root.left,l1);
    //     l1.add(root.val);
    //     find(root.right,l1);
    // }
}