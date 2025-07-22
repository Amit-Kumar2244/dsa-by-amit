// LEETCODE 437 - PATH SUM III (PURE RECURSION FIXED WITH long long)
// QUESTION LINK - "https://leetcode.com/problems/path-sum-iii/"

class Solution {
public:
    int countPaths(TreeNode* root, long long targetSum) {
        if (!root) return 0;
        int res = 0;
        if ((long long)root->val == targetSum) res++;
        res += countPaths(root->left, targetSum - root->val);
        res += countPaths(root->right, targetSum - root->val);
        return res;
    }

    int pathSum(TreeNode* root, int targetSum) {
        if (!root) return 0;
        return countPaths(root, (long long)targetSum) +
               pathSum(root->left, targetSum) +
               pathSum(root->right, targetSum);
    }
};
