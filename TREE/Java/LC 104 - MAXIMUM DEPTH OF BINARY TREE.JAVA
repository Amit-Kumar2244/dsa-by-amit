// LEETCODE 104 - MAXIMUM DEPTH OF BINARY TREE
// QUESTION LINK - "https://leetcode.com/problems/maximum-depth-of-binary-tree/"

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
