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
    public int findBottomLeftValue(TreeNode root) {
        int n=levels(root);
        int arr[]=new int[n];
        boolean visited[]=new boolean[n];
        preorder(root,0,arr,visited);
        return arr[n-1];
    }
    public void preorder(TreeNode root,int level,int arr[],boolean visited[]){
        if(root==null)return;
        if(!visited[level]){
            arr[level]=root.val;
            visited[level]=true;
        }
        preorder(root.left,level+1,arr,visited);
        preorder(root.right,level+1,arr,visited);
    }
    public int levels(TreeNode root){
        if(root==null)return 0;
        int l=levels(root.left);
        int r=levels(root.right);
        return 1+Math.max(l,r);
    }
}