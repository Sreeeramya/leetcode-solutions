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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        find(root,val);
        return root;
    }
    public void find(TreeNode root,int key){
        TreeNode temp=root;
        if(temp==null)return;
        if(temp.val<key){
            if(temp.right==null)temp.right=new TreeNode(key);
            else find(temp.right,key);
        }
        else{
            if(temp.left==null)temp.left=new TreeNode(key);
            else find(temp.left,key);
        }
    }
}