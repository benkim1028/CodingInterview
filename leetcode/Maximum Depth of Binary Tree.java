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
    public int maxDepth(TreeNode root) {
        return maxDepthHelper(root);
    }
    private int maxDepthHelper(TreeNode root){
        if(root == null) return 0;
        int leftDepth = 1 + maxDepthHelper(root.left);
        int rightDepth = 1 + maxDepthHelper(root.right);
        return Math.max(leftDepth, rightDepth);
    }
}
