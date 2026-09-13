/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root.val==p.val || root.val==q.val)return root;
        boolean p_in_left=exists(root.left,p);
        boolean q_in_left=exists(root.left,q);
        if(p_in_left && q_in_left)return lowestCommonAncestor(root.left,p,q);
        else if(!p_in_left && !q_in_left)return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
    public boolean exists(TreeNode root,TreeNode v){
        if(root==null)return false;
        if(root.val==v.val)return true;
        return exists(root.left,v) || exists(root.right,v);
    }
}