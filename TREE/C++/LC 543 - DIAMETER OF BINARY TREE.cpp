// LEETCODE 543 - DIAMETER OF BINARY TREE
// QUESTION LINK - "https://leetcode.com/problems/diameter-of-binary-tree/"

class Solution {
public:
    int helper(TreeNode* root, int& dia) {
        if (root == NULL) {
            return 0;
        }
        int left = helper(root->left, dia);
        int right = helper(root->right, dia);

        dia = max(dia, left + right); 
        return 1 + max(left, right);  
    }

    int diameterOfBinaryTree(TreeNode* root) {
        int dia = 0;
        helper(root, dia);
        return dia;
    }
};
