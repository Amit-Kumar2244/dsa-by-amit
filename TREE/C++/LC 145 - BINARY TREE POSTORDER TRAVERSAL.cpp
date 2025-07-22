// LEETCODE 145 - BINARY TREE POSTORDER TRAVERSAL
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-postorder-traversal/"

class Solution {
public:
    void postOrder(vector<int> &res, TreeNode* root)
    {
        if(root == NULL) return;
        postOrder(res, root->left);
        postOrder(res, root->right);
        res.push_back(root->val);
    }

    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> res;
        postOrder(res, root);
        return res;
    }
};
