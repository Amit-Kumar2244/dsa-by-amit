// LEETCODE 257 - BINARY TREE PATHS
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-paths/"

class Solution {
public:
    void PreOrder(TreeNode* root, vector<string> &res, string ans) {
        if (root == NULL) return;

        if (ans.empty()) ans = to_string(root->val);
        else ans += "->" + to_string(root->val);

        if (root->left == NULL && root->right == NULL) {
            res.push_back(ans);
            return;
        }

        PreOrder(root->left, res, ans);
        PreOrder(root->right, res, ans);
    }

    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        PreOrder(root, res, "");
        return res;
    }
};
