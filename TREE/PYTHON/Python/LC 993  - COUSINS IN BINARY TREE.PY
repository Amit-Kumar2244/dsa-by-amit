# Leetcode 993 - Cousins in Binary Tree
# https://leetcode.com/problems/cousins-in-binary-tree/

class Solution:
    def isCousins(self, root, x, y):
        self.dx = self.dy = self.px = self.py = None

        def dfs(node, depth, parent):
            if not node:
                return
            if node.val == x:
                self.dx, self.px = depth, parent
            if node.val == y:
                self.dy, self.py = depth, parent
            dfs(node.left, depth + 1, node)
            dfs(node.right, depth + 1, node)

        dfs(root, 0, None)
        return self.dx == self.dy and self.px != self.py
