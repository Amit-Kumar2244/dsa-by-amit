// LEETCODE 404 - SUM OF LEFT LEAVES
// QUESTION LINK - "https://leetcode.com/problems/sum-of-left-leaves/"

class Solution {
public:
    void LeftSum(int &res, TreeNode* root)
    {
        if(root == NULL) return;
        if(root->left != NULL && root->left->left == NULL && root->left->right == NULL)
        {
            res += root->left->val;
        }
        LeftSum(res, root->left);
        LeftSum(res, root->right);
    }

    int sumOfLeftLeaves(TreeNode* root) {
        int res = 0;
        LeftSum(res, root);
        return res;
    }
};
