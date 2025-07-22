# LEETCODE 257 - BINARY TREE PATHS
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-paths/"

class Solution:
    def binaryTreePaths(self, root):
        res = []

        def dfs(node, path):
            if not node:
                return
            if not node.left and not node.right:
                res.append(path + str(node.val))
                return
            path += str(node.val) + "->"
            dfs(node.left, path)
            dfs(node.right, path)

        dfs(root, "")
        return res
