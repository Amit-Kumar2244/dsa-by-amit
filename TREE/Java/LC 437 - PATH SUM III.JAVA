class Solution {
    public int countPaths(TreeNode root, long targetSum) {
        if (root == null) return 0;

        int res = 0;
        if (root.val == targetSum) res++;

        res += countPaths(root.left, targetSum - root.val);
        res += countPaths(root.right, targetSum - root.val);

        return res;
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        return countPaths(root, (long)targetSum) +
               pathSum(root.left, targetSum) +
               pathSum(root.right, targetSum);
    }
}
