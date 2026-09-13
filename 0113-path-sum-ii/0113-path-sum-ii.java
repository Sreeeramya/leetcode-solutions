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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        List<Integer> arr=new ArrayList<>();
        path(root,arr,ans,targetSum);
        return ans;
    }
    public void path(TreeNode root,List<Integer> arr,List<List<Integer>>ans,int targetSum){
        if(root==null)return;
        arr.add(root.val);
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0){
            List<Integer> arr1=new ArrayList<>();
            arr1.addAll(arr);
            ans.add(arr1);
            arr.remove(arr.size()-1);
            return;
        }
        path(root.left,arr,ans,targetSum);
        path(root.right,arr,ans,targetSum);
        arr.remove(arr.size()-1);
    }
}