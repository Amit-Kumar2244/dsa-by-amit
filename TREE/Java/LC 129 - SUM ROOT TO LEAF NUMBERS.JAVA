// LEETCODE 129 - SUM ROOT TO LEAF NUMBERS
// QUESTION LINK - "https://leetcode.com/problems/sum-root-to-leaf-numbers/"

class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currSum) {
        if (node == null) return 0;

        currSum = currSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return currSum;
        }

        return dfs(node.left, currSum) + dfs(node.right, currSum);
    }
}
