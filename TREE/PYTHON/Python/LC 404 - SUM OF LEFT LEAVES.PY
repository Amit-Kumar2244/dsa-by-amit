# LEETCODE 404 - SUM OF LEFT LEAVES
# QUESTION LINK - "https://leetcode.com/problems/sum-of-left-leaves/"

class Solution:
    def sumOfLeftLeaves(self, root):
        def dfs(node):
            if not node:
                return 0
            left_sum = 0
            if node.left and not node.left.left and not node.left.right:
                left_sum += node.left.val
            return left_sum + dfs(node.left) + dfs(node.right)
        
        return dfs(root)
