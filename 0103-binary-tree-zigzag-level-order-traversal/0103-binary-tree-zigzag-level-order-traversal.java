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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null)return l1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> curr=new ArrayList<>();
            while(size>0){
                TreeNode front=q.remove();
                curr.add(front.val);
                if(front.left!=null)q.add(front.left);
                if(front.right!=null)q.add(front.right);
                size--;
            }
            if(level%2==0)Collections.reverse(curr);
            l1.add(curr);
            level++;
        }
        return l1;
    }
}