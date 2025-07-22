# LEETCODE 104 - MAXIMUM DEPTH OF BINARY TREE
# QUESTION LINK - "https://leetcode.com/problems/maximum-depth-of-binary-tree/"

class Solution:
    def maxDepth(self, root):
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
