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
    Stack<TreeNode> s=new Stack<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            l1.add(curr.val);
            curr=curr.right;
        }
        return l1;
        // if(root==null)return l1;
        // inorderTraversal(root.left);
        // l1.add(root.val);
        // inorderTraversal(root.right);
        // return l1;
    }
}