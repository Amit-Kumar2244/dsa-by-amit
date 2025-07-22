// LEETCODE 230 - KTH SMALLEST ELEMENT IN A BST
// QUESTION LINK - "https://leetcode.com/problems/kth-smallest-element-in-a-bst/"

class Solution {
public:
    void helper(TreeNode* root, vector<int>& ans) {
        if (root == NULL) return;
        helper(root->left, ans);
        ans.push_back(root->val);
        helper(root->right, ans);
    }

    int kthSmallest(TreeNode* root, int k) {
        vector<int> ans;
        helper(root, ans);
        return ans[k - 1]; // as indexing starts from 0
    }
};
