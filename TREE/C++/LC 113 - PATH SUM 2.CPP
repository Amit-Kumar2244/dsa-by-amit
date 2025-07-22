// LEETCODE 113 - PATH SUM II
// QUESTION LINK - "https://leetcode.com/problems/path-sum-ii/"

class Solution {
public:
    void PreOrder(TreeNode* root, int curSum, int targetSum,
                  vector<int>& path, vector<vector<int>>& res) {
        if (root == NULL) return;

        curSum += root->val;
        path.push_back(root->val);

        if (root->left == NULL && root->right == NULL) {
            if (curSum == targetSum)
                res.push_back(path);
            path.pop_back();
            return;
        }

        PreOrder(root->left, curSum, targetSum, path, res);
        PreOrder(root->right, curSum, targetSum, path, res);

        path.pop_back();
    }

    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> res;
        vector<int> path;
        PreOrder(root, 0, targetSum, path, res);
        return res;
    }
};
