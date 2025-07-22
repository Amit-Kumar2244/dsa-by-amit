// Leetcode 993 - Cousins in Binary Tree
// https://leetcode.com/problems/cousins-in-binary-tree/

class Solution {
    int dx, dy, px, py;

    public void dfs(TreeNode root, int val, int depth, int parent) {
        if (root == null) return;

        if (root.val == val) {
            if (val == targetX) {
                dx = depth;
                px = parent;
            } else if (val == targetY) {
                dy = depth;
                py = parent;
            }
        }

        dfs(root.left, val, depth + 1, root.val);
        dfs(root.right, val, depth + 1, root.val);
    }

    int targetX, targetY;

    public boolean isCousins(TreeNode root, int x, int y) {
        dx = dy = px = py = -1;
        targetX = x;
        targetY = y;
        dfs(root, x, 0, -1);
        dfs(root, y, 0, -1);
        return dx == dy && px != py;
    }
}
