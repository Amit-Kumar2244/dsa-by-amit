// Leetcode 993 - Cousins in Binary Tree
// https://leetcode.com/problems/cousins-in-binary-tree/

class Solution {
public:
    void dfs(TreeNode* root, int val, int depth, int parent,
             int& foundDepth, int& foundParent) {
        if (!root) return;
        if (root->val == val) {
            foundDepth = depth;
            foundParent = parent;
            return;
        }
        dfs(root->left, val, depth + 1, root->val, foundDepth, foundParent);
        dfs(root->right, val, depth + 1, root->val, foundDepth, foundParent);
    }

    bool isCousins(TreeNode* root, int x, int y) {
        int dx = -1, dy = -1, px = -1, py = -1;
        dfs(root, x, 0, -1, dx, px);
        dfs(root, y, 0, -1, dy, py);
        return dx == dy && px != py;
    }
};
