// GFG - SUM OF LEAF NODES
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes/1"

class Solution {
  public:
    void leaf(int &res, Node* root)
    {
        if(root==NULL) return;
        if(root->left==NULL && root->right==NULL) res+=root->data;
        leaf(res,root->left);
        leaf(res,root->right);
    }
    int leafSum(Node* root) {
        int res=0;
        leaf(res,root);
        return res;
    }
};
