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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverse(ans, root);
        return ans;
    }
    private void traverse(List<Integer> ans, TreeNode root){
        if(root == null) return;
        traverse(ans, root.left);
        ans.add(root.val);
        traverse(ans, root.right);
    }
}
