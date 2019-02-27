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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(!hasOne(root)) return null;
        return root;
    }
    private boolean hasOne(TreeNode root) {
        if(root.left == null && root.right == null && root.val == 0) return false;
        else return true;
    }
}
