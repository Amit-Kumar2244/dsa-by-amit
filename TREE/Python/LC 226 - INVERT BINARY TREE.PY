# LeetCode 226 - Invert Binary Tree
# Link: https://leetcode.com/problems/invert-binary-tree/

class Solution:
    def invertTree(self, root):
        if not root:
            return None
        root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
        return root
