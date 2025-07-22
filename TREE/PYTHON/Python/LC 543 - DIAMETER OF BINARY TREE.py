# LEETCODE 543 - DIAMETER OF BINARY TREE
# QUESTION LINK - "https://leetcode.com/problems/diameter-of-binary-tree/"

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def helper(self, root, dia):
        if not root:
            return 0
        left = self.helper(root.left, dia)
        right = self.helper(root.right, dia)

        dia[0] = max(dia[0], left + right)
        return 1 + max(left, right)

    def diameterOfBinaryTree(self, root):
        dia = [0]
        self.helper(root, dia)
        return dia[0]
