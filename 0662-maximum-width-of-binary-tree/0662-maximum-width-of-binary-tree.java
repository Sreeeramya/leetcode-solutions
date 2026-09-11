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
    int idx;
    Pair(TreeNode temp,int idx){
        this.temp=temp;
        this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int max_width=1;
        while(!q.isEmpty()){
            int size=q.size();

            int first=q.peek().idx;
            int last=0;
            while(size>0){
                Pair front=q.remove();
                last=front.idx;
                if(front.temp.left!=null)q.add(new Pair(front.temp.left,2*front.idx+1));
                if(front.temp.right!=null)q.add(new Pair(front.temp.right,2*front.idx+2));
                size--;
            }
            int width=last-first+1;
            max_width=Math.max(max_width,width);
        }
        return max_width;
    }
}