# LEETCODE 94 - BINARY TREE INORDER TRAVERSAL
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-inorder-traversal/"

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def inOrder(self, root, res):
        if not root:
            return
        self.inOrder(root.left, res)
        res.append(root.val)
        self.inOrder(root.right, res)

    def inorderTraversal(self, root):
        res = []
        self.inOrder(root, res)
        return res
