class Solution {
    public TreeNode convertBST(TreeNode root) {
        helper(root, 0);
        return root;
    }
    private int helper(TreeNode root, int sum){
        if(root == null) return sum;
        int rightsum = helper(root.right, sum);
        root.val = root.val + rightsum;
        return helper(root.left, root.val);
    }
}
