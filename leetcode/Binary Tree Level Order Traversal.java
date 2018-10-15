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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        traverseTree(ans,root,0);
        return ans;
    }
    private void traverseTree(List<List<Integer>> ans, TreeNode root, int depth){
        if (root == null) return;
        if(ans.size() >= depth + 1)
            ans.get(depth).add(root.val);
        else{
            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);
            ans.add(arr);
        }
        traverseTree(ans, root.left, depth + 1);
        traverseTree(ans, root.right, depth + 1);
    }
}
