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
    public void flatten(TreeNode root) {
        if(root==null)return;
        TreeNode lst=root.left;
        TreeNode rst=root.right;
        root.left=null;
        root.right=lst;
        flatten(lst);
        flatten(rst);
        TreeNode last=root;
        while(last.right!=null)last=last.right;
        last.right=rst;
    }
}