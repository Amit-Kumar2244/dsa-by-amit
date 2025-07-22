# GFG - TREE BOUNDARY TRAVERSAL
# QUESTION LINK - "https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1"

class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

class Solution:
    def isLeaf(self, node):
        return node.left is None and node.right is None

    def addLeftBoundary(self, node, res):
        while node:
            if not self.isLeaf(node):
                res.append(node.data)
            if node.left:
                node = node.left
            else:
                node = node.right

    def addLeaves(self, node, res):
        if not node:
            return
        if self.isLeaf(node):
            res.append(node.data)
        else:
            self.addLeaves(node.left, res)
            self.addLeaves(node.right, res)

    def addRightBoundary(self, node, res):
        tmp = []
        while node:
            if not self.isLeaf(node):
                tmp.append(node.data)
            if node.right:
                node = node.right
            else:
                node = node.left
        res.extend(reversed(tmp))

    def boundaryTraversal(self, root):
        res = []
        if not root:
            return res
        if not self.isLeaf(root):
            res.append(root.data)
        self.addLeftBoundary(root.left, res)
        self.addLeaves(root, res)
        self.addRightBoundary(root.right, res)
        return res
