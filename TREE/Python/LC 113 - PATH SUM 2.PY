# LEETCODE 113 - PATH SUM II
# QUESTION LINK - "https://leetcode.com/problems/path-sum-ii/"

class Solution:
    def pathSum(self, root, targetSum):
        result = []

        def dfs(node, path, total):
            if not node:
                return
            total += node.val
            path.append(node.val)
            if not node.left and not node.right:
                if total == targetSum:
                    result.append(list(path))
            else:
                dfs(node.left, path, total)
                dfs(node.right, path, total)
            path.pop()

        dfs(root, [], 0)
        return result
