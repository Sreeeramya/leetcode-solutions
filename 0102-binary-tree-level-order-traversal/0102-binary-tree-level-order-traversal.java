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
 class Pair1{
    TreeNode temp;
    int level;
    Pair1(TreeNode temp,int level){
        this.temp=temp;
        this.level=level;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null)return l1;
        
        Queue<Pair1> q=new LinkedList<>();
        int curr_level=0;
        l1.add(new ArrayList<>());
        q.add(new Pair1(root,0));
        while(q.size()>0){
            Pair1 front=q.remove();
            if(front.level!=curr_level){
                curr_level++;
                l1.add(new ArrayList<>());
            }
            l1.get(curr_level).add(front.temp.val);
            if(front.temp.left!=null)q.add(new Pair1(front.temp.left, front.level+1));
            if(front.temp.right!=null)q.add(new Pair1(front.temp.right, front.level+1));
        }
        return l1;
    }
}