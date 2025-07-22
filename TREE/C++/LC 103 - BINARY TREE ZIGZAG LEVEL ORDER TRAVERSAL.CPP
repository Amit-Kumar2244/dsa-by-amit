// LEETCODE 103 - BINARY TREE ZIGZAG LEVEL ORDER TRAVERSAL
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/"

class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(root == NULL) return res;

        queue<TreeNode*> Q;
        Q.push(root);
        bool leftToRight = true;

        while(!Q.empty()) {
            int size = Q.size();
            vector<int> level(size);
            
            for(int i = 0; i < size; i++) {
                TreeNode* node = Q.front();
                Q.pop();

                int index = leftToRight ? i : size - 1 - i;
                level[index] = node->val;

                if(node->left) Q.push(node->left);
                if(node->right) Q.push(node->right);
            }

            res.push_back(level);
            leftToRight = !leftToRight;
        }

        return res;
    }
};
