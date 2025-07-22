// LEETCODE 98 - VALIDATE BINARY SEARCH TREE
// QUESTION LINK - "https://leetcode.com/problems/validate-binary-search-tree/"

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val <= minVal || root.val >= maxVal) return false;
        return isBST(root.left, minVal, root.val) &&
               isBST(root.right, root.val, maxVal);
    }

    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
