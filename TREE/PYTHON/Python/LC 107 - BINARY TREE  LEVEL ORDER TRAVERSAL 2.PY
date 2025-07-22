# LEETCODE 107 - BINARY TREE LEVEL ORDER TRAVERSAL II
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-level-order-traversal-ii/"

from collections import deque

class Solution:
    def levelOrderBottom(self, root):
        res = []
        if not root:
            return res

        queue = deque([root])

        while queue:
            size = len(queue)
            level = []

            for _ in range(size):
                node = queue.popleft()
                level.append(node.val)

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            res.insert(0, level)  # Insert at front for reverse order

        return res
