// LEETCODE 94 - BINARY TREE INORDER TRAVERSAL
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-inorder-traversal/"

class Solution {
public:
    void inOrder(vector<int> &res, TreeNode* root)
    {
        if (root == NULL) return;
        inOrder(res, root->left);
        res.push_back(root->val);
        inOrder(res, root->right);
    }

    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        inOrder(res, root);
        return res;
    }
};
