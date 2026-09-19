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
 class Quad{
    int max;
    int min;
    int size;
    int sum;
    boolean isBST;
    Quad(int max,int min,int size,int sum,boolean isBST){
        this.max=max;
        this.min=min;
        this.size=size;
        this.sum=sum;
        this.isBST=isBST;
    }
 }
class Solution {
    int mx_sum;
    public int maxSumBST(TreeNode root) {
        mx_sum=0;
        helper(root);
        return mx_sum;
    }
    public Quad helper(TreeNode root){
        if(root==null)return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0,true);
        Quad lst=helper(root.left);
        Quad rst=helper(root.right);
        int mx=Math.max(root.val,Math.max(lst.max,rst.max));
        int mn=Math.min(root.val,Math.min(lst.min,rst.min));
        int sz=1+lst.size+rst.size;
        int sum=root.val+lst.sum+rst.sum;
        boolean isBst=lst.isBST && rst.isBST && (lst.max<root.val && rst.min>root.val);
        if(isBst)mx_sum=Math.max(mx_sum,sum);
        return new Quad(mx,mn,sz,sum,isBst);
    }
}