/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        Queue<Integer> que = new LinkedList<>();
        getLeaves(root1, que);
        System.out.println(que);
        return checkLeaves(root2, que);
    }
    private void getLeaves(TreeNode root, Queue<Integer> que){
        if(root == null) return;
        if(root.left == null && root.right == null){
            que.add(root.val);
            return;
        }
        getLeaves(root.left, que);
        getLeaves(root.right, que);
    }
    private boolean checkLeaves(TreeNode root, Queue<Integer> que){
        if(root == null) return true;
        if(root.left == null && root.right == null) {
            if(que.poll() != root.val)
                return false;
            else
                return true;
        }
        return checkLeaves(root.left, que) && checkLeaves(root.right, que);
    }
}
