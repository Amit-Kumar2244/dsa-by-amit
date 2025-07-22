// LEETCODE 872 - LEAF-SIMILAR TREES
// QUESTION LINK - "https://leetcode.com/problems/leaf-similar-trees/"

class Solution {
public:
    void getLeafSequence(TreeNode* root, vector<int>& leaves) {
        if (!root) return;
        if (!root->left && !root->right) {
            leaves.push_back(root->val);
        }
        getLeafSequence(root->left, leaves);
        getLeafSequence(root->right, leaves);
    }

    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> leaf1, leaf2;
        getLeafSequence(root1, leaf1);
        getLeafSequence(root2, leaf2);
        return leaf1 == leaf2;
    }
};
