// LEETCODE 543 - DIAMETER OF BINARY TREE
// QUESTION LINK - "https://leetcode.com/problems/diameter-of-binary-tree/"

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private int helper(TreeNode root, int[] dia) {
        if (root == null) return 0;

        int left = helper(root.left, dia);
        int right = helper(root.right, dia);

        dia[0] = Math.max(dia[0], left + right);
        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        helper(root, dia);
        return dia[0];
    }
}
