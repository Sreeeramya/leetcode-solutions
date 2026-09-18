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
    public boolean isValidBST(TreeNode root) {
        boolean val=true;
        ArrayList<Integer> l1=new ArrayList<>();
        find(root,l1);
        for(int i=1;i<l1.size();i++){
            if(l1.get(i)<=l1.get(i-1)){
                val=false;
                break;
            }
        }
        return val;
    }
    public void find(TreeNode root,ArrayList<Integer> l1){
        if(root==null)return;
        find(root.left,l1);
        l1.add(root.val);
        find(root.right,l1);
    }
}