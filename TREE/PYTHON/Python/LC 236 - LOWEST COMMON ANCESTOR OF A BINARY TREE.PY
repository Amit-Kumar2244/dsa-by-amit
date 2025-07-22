# LEETCODE 236 - LOWEST COMMON ANCESTOR OF A BINARY TREE
# QUESTION LINK - "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/"

class Solution:
    def lowestCommonAncestor(self, root, p, q):
        if not root or root == p or root == q:
            return root

        left = self.lowestCommonAncestor(root.left, p, q)
        right = self.lowestCommonAncestor(root.right, p, q)

        if left and right:
            return root
        return left if left else right
