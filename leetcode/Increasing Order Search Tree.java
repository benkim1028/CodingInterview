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
    TreeNode start;
    public TreeNode increasingBST(TreeNode root) {
        start = new TreeNode(0);
        TreeNode temp = start;
        traverseTree(root);
        return temp.right;
        
    }
    private void traverseTree(TreeNode root){
        if(root == null) return;
        traverseTree(root.left);
        root.left = null;
        start.right = root;
        start = start.right;
        traverseTree(root.right);
    }
}
