// LEETCODE 144 - BINARY TREE PREORDER TRAVERSAL
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-preorder-traversal/"

class Solution {
public:
    void preOrder(vector<int> &res, TreeNode* root)
    {
        if(root==NULL) return;
        res.push_back(root->val);
        preOrder(res,root->left);
        preOrder(res,root->right);
    }
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> res;
        preOrder(res,root);
        return res;
    }
};
