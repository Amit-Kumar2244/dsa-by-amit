// LeetCode 110 - Balanced Binary Tree
// Link: https://leetcode.com/problems/balanced-binary-tree/

class Solution {
    public int check(TreeNode root) {
        if (root == null) return 0;
        int left = check(root.left);
        if (left == -1) return -1;
        int right = check(root.right);
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }
}
