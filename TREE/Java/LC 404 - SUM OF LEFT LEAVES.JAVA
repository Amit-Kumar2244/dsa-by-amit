// LEETCODE 404 - SUM OF LEFT LEAVES
// QUESTION LINK - "https://leetcode.com/problems/sum-of-left-leaves/"

class Solution {
    private void leftSum(TreeNode root, int[] sum) {
        if (root == null) return;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum[0] += root.left.val;
        }
        leftSum(root.left, sum);
        leftSum(root.right, sum);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = new int[1];
        leftSum(root, sum);
        return sum[0];
    }
}
