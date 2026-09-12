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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> l1=new ArrayList<>();
        if(root==null)return l1;
        int n=levels(root);
        int arr[]=new int[n];
        preorder(root,0,arr);
        for(int a:arr){
            l1.add(a);
        }
        return l1;
    }
    public void preorder(TreeNode root,int level,int arr[]){
        if(root==null)return;
        arr[level]=root.val;
        preorder(root.left,level+1,arr);
        preorder(root.right,level+1,arr);
    }
    public int levels(TreeNode root){
        if(root==null)return 0;
        int l=levels(root.left);
        int r=levels(root.right);
        return 1+Math.max(l,r);
    }
}