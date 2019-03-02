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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty() || !q2.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            while(!q1.isEmpty()){
                TreeNode node = q1.poll();
                list.add(node.val);
                if(node.left != null) q2.add(node.left);
                if(node.right != null) q2.add(node.right);
            } 
            if(list.size() > 0) ans.add(list);
            list = new ArrayList<Integer>();
            while(!q2.isEmpty()){
                TreeNode node = q2.poll();
                list.add(node.val);
                if(node.left != null) q1.add(node.left);
                if(node.right != null) q1.add(node.right);
            }
            if(list.size() > 0) ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
}
