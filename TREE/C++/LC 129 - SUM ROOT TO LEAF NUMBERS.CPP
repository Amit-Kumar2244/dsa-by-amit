// LEETCODE 129 - SUM ROOT TO LEAF NUMBERS
// QUESTION LINK - "https://leetcode.com/problems/sum-root-to-leaf-numbers/"

class Solution {
public:
    void preOrder(TreeNode* root, int &res, int curSum) {
        if (root == NULL) return;

        curSum = curSum * 10 + root->val;

        if (root->left == NULL && root->right == NULL) {
            res += curSum;
            return;
        }

        preOrder(root->left, res, curSum);
        preOrder(root->right, res, curSum);
    }

    int sumNumbers(TreeNode* root) {
        int res = 0;
        preOrder(root, res, 0);
        return res;
    }
};
