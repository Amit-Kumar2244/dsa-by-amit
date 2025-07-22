# LEETCODE 102 - BINARY TREE LEVEL ORDER TRAVERSAL
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-level-order-traversal/"

from collections import deque

class Solution:
    def levelOrder(self, root):
        res = []
        if not root:
            return res

        queue = deque([root])

        while queue:
            level = []
            size = len(queue)

            for _ in range(size):
                node = queue.popleft()
                level.append(node.val)

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            res.append(level)

        return res
