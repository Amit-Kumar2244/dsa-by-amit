// LEETCODE 235 - LOWEST COMMON ANCESTOR OF A BINARY SEARCH TREE
// QUESTION LINK - "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/"

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if(root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
