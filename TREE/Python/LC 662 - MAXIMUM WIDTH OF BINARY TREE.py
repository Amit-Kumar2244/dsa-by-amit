// LeetCode 662 - Maximum Width of Binary Tree
// https://leetcode.com/problems/maximum-width-of-binary-tree/

from collections import deque

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def widthOfBinaryTree(self, root):
        if not root:
            return 0

        max_width = 0
        queue = deque([(root, 0)])

        while queue:
            level_length = len(queue)
            _, first_index = queue[0]

            for _ in range(level_length):
                node, idx = queue.popleft()
                idx -= first_index
                if node.left:
                    queue.append((node.left, 2 * idx))
                if node.right:
                    queue.append((node.right, 2 * idx + 1))

            if queue:
                max_width = max(max_width, queue[-1][1] - queue[0][1] + 1)
            else:
                max_width = max(max_width, 1)

        return max_width
