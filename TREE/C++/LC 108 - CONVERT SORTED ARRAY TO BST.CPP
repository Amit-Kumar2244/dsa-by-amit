// LEETCODE 108 - CONVERT SORTED ARRAY TO BINARY SEARCH TREE
// QUESTION LINK - "https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/"

class Solution {
public:
    TreeNode* helper(vector<int>& nums, int left, int right) {
        if (left > right) return NULL;

        int mid = (left + right) / 2;
        TreeNode* root = new TreeNode(nums[mid]);

        root->left = helper(nums, left, mid - 1);
        root->right = helper(nums, mid + 1, right);

        return root;
    }

    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return helper(nums, 0, nums.size() - 1);
    }
};
