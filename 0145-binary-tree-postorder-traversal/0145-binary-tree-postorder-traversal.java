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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)return l1;
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(s.size()>0){
            TreeNode ans=s.pop();
            l1.add(ans.val);
            if(ans.left!=null)s.push(ans.left);
            if(ans.right!=null)s.push(ans.right);
        }
        Collections.reverse(l1);
        return l1;
        // postorderTraversal(root.left);
        // postorderTraversal(root.right);
        // l1.add(root.val);
        // return l1;
    }
}