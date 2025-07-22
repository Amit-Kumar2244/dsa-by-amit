// LEETCODE 112 - PATH SUM
// QUESTION LINK - "https://leetcode.com/problems/path-sum/"

class Solution {
public:
    bool preOrder(TreeNode* root, int targetSum, int curSum) {
        if (root == NULL) return false;

        curSum += root->val;

        if (root->left == NULL && root->right == NULL)
            return curSum == targetSum;

        return preOrder(root->left, targetSum, curSum) ||
               preOrder(root->right, targetSum, curSum);
    }

    bool hasPathSum(TreeNode* root, int targetSum) {
        return preOrder(root, targetSum, 0);
    }
};
