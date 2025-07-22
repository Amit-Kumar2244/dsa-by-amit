// GFG - COUNT COMPLETE TREE NODES
// QUESTION LINK - "https://leetcode.com/problems/count-complete-tree-nodes/description/"

class Solution {
public:
void Helper(vector<int>& ans,TreeNode* root){
    if(root == NULL){
        return;
    }
    Helper(ans,root->left);
    Helper(ans,root->right);
    ans.push_back(root->val);
}
    int countNodes(TreeNode* root) {
        vector<int> ans;
        Helper(ans,root);
        return ans.size();
        
    }
};

