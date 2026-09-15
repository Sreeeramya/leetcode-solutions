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
    List<Integer> l1=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return l1;
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode ans=s.pop();
            l1.add(ans.val);
            if(ans.right!=null)s.push(ans.right);
            if(ans.left!=null)s.push(ans.left);
        }
        return l1;
        // if(root==null)return l1;
        // l1.add(root.val);
        // preorderTraversal(root.left);
        // preorderTraversal(root.right);
        // return l1;
    }
}