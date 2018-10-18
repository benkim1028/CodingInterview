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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }
    private TreeNode merge(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return null;
        TreeNode newNode;
        if(t1 == null) newNode = t2;
        else if (t2 == null) newNode = t1;
        else{
            newNode = t1;
            newNode.val += t2.val;
            newNode.left = merge(t1.left, t2.left);
            newNode.right = merge(t1.right, t2.right);
        }
        return newNode;
    }
}
