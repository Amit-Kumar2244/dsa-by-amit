# LEETCODE 144 - BINARY TREE PREORDER TRAVERSAL
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-preorder-traversal/"

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def preOrder(self, root, res):
        if not root:
            return
        res.append(root.val)
        self.preOrder(root.left, res)
        self.preOrder(root.right, res)

    def preorderTraversal(self, root):
        res = []
        self.preOrder(root, res)
        return res
