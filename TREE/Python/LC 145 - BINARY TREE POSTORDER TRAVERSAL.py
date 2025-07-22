# LEETCODE 145 - BINARY TREE POSTORDER TRAVERSAL
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-postorder-traversal/"

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def postOrder(self, root, res):
        if not root:
            return
        self.postOrder(root.left, res)
        self.postOrder(root.right, res)
        res.append(root.val)

    def postorderTraversal(self, root):
        res = []
        self.postOrder(root, res)
        return res
