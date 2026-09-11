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
    TreeNode temp;
    int level;
    Pair(TreeNode temp,int level){
        this.temp=temp;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null)return l1;
        Queue<Pair> q=new LinkedList<>();
        int curr_level=0;
        l1.add(new ArrayList<>());
        q.add(new Pair(root,0));
        while(q.size()>0){
                Pair front=q.remove();
                if(front.level!=curr_level){
                    curr_level++;
                    l1.add(new ArrayList<>());
                }
                l1.get(curr_level).add(front.temp.val);
                if(front.temp.left!=null)q.add(new Pair(front.temp.left,front.level+1));
                if(front.temp.right!=null)q.add(new Pair(front.temp.right,front.level+1));
            }
        Collections.reverse(l1);
        return l1;
    }
}