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
    
    int prevDepth = -1;
    int max = -1;
    
    public boolean isCompleteTree(TreeNode root) {
        return dfs(root, 0);
    }
    
    private boolean dfs(TreeNode root, int depth){
        if(root == null) {
            if(this.max == -1){
                this.max = depth;
                this.prevDepth = depth;
                return true;
            }
            else {
                if(depth <= this.max && depth >= this.max - 1 && depth <= this.prevDepth){
                    this.prevDepth = depth;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return dfs(root.left, depth + 1) && dfs(root.right, depth + 1);
    }
}
