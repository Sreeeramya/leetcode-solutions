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
    int row;
    int col;
    Pair(TreeNode temp,int row,int col){
        this.temp=temp;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> t1 =
            new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0, 0));

        while (!q.isEmpty()) {

            Pair curr = q.remove();

            t1.putIfAbsent(curr.col, new TreeMap<>());
            t1.get(curr.col).putIfAbsent(curr.row, new PriorityQueue<>());

            t1.get(curr.col)
              .get(curr.row)
              .add(curr.temp.val);

            if (curr.temp.left != null) {
                q.add(new Pair(
                    curr.temp.left,
                    curr.row + 1,
                    curr.col - 1
                ));
            }

            if (curr.temp.right != null) {
                q.add(new Pair(
                    curr.temp.right,
                    curr.row + 1,
                    curr.col + 1
                ));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : t1.values()) {

            List<Integer> temp = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {

                while (!pq.isEmpty()) {
                    temp.add(pq.remove());
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}