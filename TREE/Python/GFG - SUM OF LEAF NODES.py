# GFG - SUM OF LEAF NODES
# QUESTION LINK - "https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes/1"

class Solution:
    def leafSum(self, root):
        def dfs(node):
            if not node:
                return 0
            if not node.left and not node.right:
                return node.data
            return dfs(node.left) + dfs(node.right)

        return dfs(root)
