# LEETCODE 437 - PATH SUM III (PURE RECURSION)
# QUESTION LINK - "https://leetcode.com/problems/path-sum-iii/"

class Solution:
    def countPaths(self, root, targetSum):
        if not root:
            return 0
        res = 1 if root.val == targetSum else 0
        res += self.countPaths(root.left, targetSum - root.val)
        res += self.countPaths(root.right, targetSum - root.val)
        return res

    def pathSum(self, root, targetSum):
        if not root:
            return 0
        return (self.countPaths(root, targetSum) +
                self.pathSum(root.left, targetSum) +
                self.pathSum(root.right, targetSum))
