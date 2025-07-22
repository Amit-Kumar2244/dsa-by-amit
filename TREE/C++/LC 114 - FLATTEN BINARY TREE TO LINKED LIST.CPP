// LEETCODE 114 - FLATTEN BINARY TREE TO LINKED LIST
// QUESTION LINK - "https://leetcode.com/problems/flatten-binary-tree-to-linked-list/"

class Solution {
public:
    void flatten(TreeNode* root) {
        TreeNode* curr = root;
        while (curr) {
            if (curr->left) {
                TreeNode* prev = curr->left;
                while (prev->right) prev = prev->right;
                prev->right = curr->right;
                curr->right = curr->left;
                curr->left = nullptr;
            }
            curr = curr->right;
        }
    }
};
