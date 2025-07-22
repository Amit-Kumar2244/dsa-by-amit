# LEETCODE 988 - SMALLEST STRING STARTING FROM LEAF
# QUESTION LINK - "https://leetcode.com/problems/smallest-string-starting-from-leaf/"

class Solution:
    def smallestFromLeaf(self, root):
        self.result = "~"

        def dfs(node, path):
            if not node:
                return

            path = chr(ord('a') + node.val) + path

            if not node.left and not node.right:
                if path < self.result:
                    self.result = path

            dfs(node.left, path)
            dfs(node.right, path)

        dfs(root, "")
        return self.result
