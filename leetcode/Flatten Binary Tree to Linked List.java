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
    public void flatten(TreeNode root) {
        convertTreeToList(root);        
    }
    private TreeNode convertTreeToList(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode last = convertTreeToList(root.right);
        if(last == null) root.right = temp;
        else last.right = temp;
        if(temp == null) return last;
        return convertTreeToList(temp);
    }
}
