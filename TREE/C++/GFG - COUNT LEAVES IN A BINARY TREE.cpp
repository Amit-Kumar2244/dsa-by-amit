// GFG - COUNT LEAVES IN BINARY TREE
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1"


class Solution {
  public:
    void Leaf(int &res, Node* root) {
        if(root == NULL) return;
        if(root->left == NULL && root->right == NULL)
            res++;
        Leaf(res, root->left);
        Leaf(res, root->right);
    }

    int countLeaves(Node* root) {
        int res = 0;
        Leaf(res, root);
        return res;
    }
};

