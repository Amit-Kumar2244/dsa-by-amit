// LEETCODE 107 - BINARY TREE LEVEL ORDER TRAVERSAL II
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-level-order-traversal-ii/"

class Solution {
public:
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int>> res;
        if (root == NULL) return res;

        queue<TreeNode*> Q;
        Q.push(root);

        while (!Q.empty()) {
            vector<int> level;
            int size = Q.size();

            for (int i = 0; i < size; i++) {
                TreeNode* curr = Q.front();
                Q.pop();
                level.push_back(curr->val);

                if (curr->left) Q.push(curr->left);
                if (curr->right) Q.push(curr->right);
            }

            res.push_back(level);
        }

        reverse(res.begin(), res.end());
        return res;
    }
};
