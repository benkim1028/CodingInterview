class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        int pathSum = 0;
        return calculateSum(root, sum, pathSum);
    }
    private boolean calculateSum(TreeNode root, int sum, int pathSum){
        if(root == null)
            return false;
        int newPathSum = pathSum + root.val;
        if(root.left == null && root.right == null && sum == newPathSum)
            return true;
        else if (root.left == null && root.right == null)
            return false;
        return calculateSum(root.left, sum, newPathSum) || calculateSum(root.right, sum, newPathSum);
    }
}
