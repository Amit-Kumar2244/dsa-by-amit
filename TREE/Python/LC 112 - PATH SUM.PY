# LEETCODE 112 - PATH SUM
# QUESTION LINK - "https://leetcode.com/problems/path-sum/"

class Solution:
    def hasPathSum(self, root, targetSum):
        if not root:
            return False

        targetSum -= root.val

        if not root.left and not root.right:
            return targetSum == 0

        return self.hasPathSum(root.left, targetSum) or self.hasPathSum(root.right, targetSum)
