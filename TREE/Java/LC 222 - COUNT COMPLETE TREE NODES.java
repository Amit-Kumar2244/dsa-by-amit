// LEETCODE 222 - Count Complete Tree Nodes
// QUESTION LINK - https://leetcode.com/problems/count-complete-tree-nodes/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private void count(TreeNode root, int[] ans) {
        if (root == null) return;
        ans[0]++;
        count(root.left, ans);
        count(root.right, ans);
    }

    public int countNodes(TreeNode root) {
        int[] ans = new int[1];  // Using array to simulate pass-by-reference
        count(root, ans);
        return ans[0];
    }
}
