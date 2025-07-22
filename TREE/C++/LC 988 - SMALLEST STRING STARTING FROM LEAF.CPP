// LEETCODE 988 - SMALLEST STRING STARTING FROM LEAF
// QUESTION LINK - "https://leetcode.com/problems/smallest-string-starting-from-leaf/"

class Solution {
public:
    void dfs(TreeNode* root, string path, string &res) {
        if (!root) return;

        path = char('a' + root->val) + path;

        if (!root->left && !root->right) {
            if (res.empty() || path < res) {
                res = path;
            }
            return;
        }

        dfs(root->left, path, res);
        dfs(root->right, path, res);
    }

    string smallestFromLeaf(TreeNode* root) {
        string res;
        dfs(root, "", res);
        return res;
    }
};
