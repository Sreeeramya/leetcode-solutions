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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l1=new ArrayList<>();
        find(root,k,l1);
        return l1.get(k-1);
    }
    public void find(TreeNode root,int k,ArrayList<Integer> l1){
        if(root==null)return;
        find(root.left,k,l1);
        l1.add(root.val);
        find(root.right,k,l1);
    }
}