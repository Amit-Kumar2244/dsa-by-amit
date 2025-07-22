// GFG - SUM OF BINARY TREE
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1"

class Solution {
  public:
    void helper(Node* root, int &sum) {
        if (root == NULL) return;
        sum += root->data;
        helper(root->left, sum);
        helper(root->right, sum);
    }
    
    int sumBT(Node* root) {
        int sum = 0;
        helper(root, sum);
        return sum;
    }
};
