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
class Solution {
    public int minDepth(TreeNode root) {
        return levels(root);
    }
    public int levels(TreeNode root){
        if(root==null)return 0;
        if(root.right==null)return 1+levels(root.left);
        if(root.left==null)return 1+levels(root.right);
        int l=levels(root.left);
        int r=levels(root.right);
        return 1+Math.min(l,r);
    }
}