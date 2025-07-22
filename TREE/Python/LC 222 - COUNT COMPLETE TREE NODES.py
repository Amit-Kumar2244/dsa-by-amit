# LEETCODE 222 - Count Complete Tree Nodes
# QUESTION LINK - https://leetcode.com/problems/count-complete-tree-nodes/

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def count(self, root, ans):
        if not root:
            return
        ans[0] += 1
        self.count(root.left, ans)
        self.count(root.right, ans)

    def countNodes(self, root):
        ans = [0]  # Using list to simulate pass-by-reference
        self.count(root, ans)
        return ans[0]
