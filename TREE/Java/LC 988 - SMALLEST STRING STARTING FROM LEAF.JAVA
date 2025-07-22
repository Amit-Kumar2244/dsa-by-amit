// LEETCODE 988 - SMALLEST STRING STARTING FROM LEAF
// QUESTION LINK - "https://leetcode.com/problems/smallest-string-starting-from-leaf/"

class Solution {
    private String result = "~";

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return result;
    }

    private void dfs(TreeNode node, String path) {
        if (node == null) return;

        path = (char) ('a' + node.val) + path;

        if (node.left == null && node.right == null) {
            if (path.compareTo(result) < 0) {
                result = path;
            }
        }

        dfs(node.left, path);
        dfs(node.right, path);
    }
}
