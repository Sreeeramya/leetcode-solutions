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
class Pair{
    int sum;
    int size;
    int count;
    Pair(int sum,int size,int count){
        this.sum=sum;
        this.size=size;
        this.count=count;
    }
}
class Solution {
    public Pair check(TreeNode root){
        if(root==null)return new Pair(0,0,0);
        Pair left=check(root.left);
        Pair right=check(root.right);
        int sum=left.sum+right.sum+root.val;
        int size=left.size+right.size+1;
        int count=left.count+right.count;
        if(sum/size==root.val)count++;
        return new Pair(sum,size,count);
    }
    public int averageOfSubtree(TreeNode root) {
        return check(root).count;
    }
}