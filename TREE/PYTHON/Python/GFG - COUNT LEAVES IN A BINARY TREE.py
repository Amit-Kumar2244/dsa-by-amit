# GFG - COUNT LEAVES IN BINARY TREE
# QUESTION LINK - "https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1"

class Solution:
    def countLeaves(self, root):
        def dfs(node):
            if not node:
                return 0
            if not node.left and not node.right:
                return 1
            return dfs(node.left) + dfs(node.right)
        
        return dfs(root)
