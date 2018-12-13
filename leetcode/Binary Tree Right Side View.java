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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int[] last = new int[1];
        last[0] = -1;
        traverseTree(root, 0, last, ans);
        return ans;
    }
    
    private void traverseTree(TreeNode root, int depth, int[] last, List<Integer> ans){
        if(root == null) return;
        if(depth > last[0]) {
            ans.add(root.val);
            last[0] = depth;
        }
        traverseTree(root.right, depth + 1, last, ans);
        traverseTree(root.left, depth + 1, last, ans);
    }
}
