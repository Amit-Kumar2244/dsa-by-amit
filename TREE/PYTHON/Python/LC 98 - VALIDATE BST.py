# LEETCODE 98 - VALIDATE BINARY SEARCH TREE
# QUESTION LINK - "https://leetcode.com/problems/validate-binary-search-tree/"

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isBST(self, root, minval, maxval):
        if root is None:
            return True
        if root.val <= minval or root.val >= maxval:
            return False
        return self.isBST(root.left, minval, root.val) and \
               self.isBST(root.right, root.val, maxval)

    def isValidBST(self, root):
        return self.isBST(root, float('-inf'), float('inf'))
