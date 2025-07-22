# GFG - SUM OF BINARY TREE
# QUESTION LINK - "https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1"

class Solution:
    def helper(self, root, sum_ref):
        if not root:
            return
        sum_ref[0] += root.data
        self.helper(root.left, sum_ref)
        self.helper(root.right, sum_ref)

    def sumBT(self, root):
        sum_ref = [0]
        self.helper(root, sum_ref)
        return sum_ref[0]
