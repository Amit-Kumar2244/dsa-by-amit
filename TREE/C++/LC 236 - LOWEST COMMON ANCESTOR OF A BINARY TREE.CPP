// LEETCODE 236 - LOWEST COMMON ANCESTOR OF A BINARY TREE
// QUESTION LINK - "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/"

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        if (root == NULL || root == p || root == q)
            return root;

        TreeNode* left = lowestCommonAncestor(root->left, p, q);
        TreeNode* right = lowestCommonAncestor(root->right, p, q);

        if (left && right) return root;
        return left ? left : right;
    }
};
