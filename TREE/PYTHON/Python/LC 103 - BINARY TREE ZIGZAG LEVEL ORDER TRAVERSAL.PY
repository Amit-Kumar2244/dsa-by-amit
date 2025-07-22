# LEETCODE 103 - BINARY TREE ZIGZAG LEVEL ORDER TRAVERSAL
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/"

from collections import deque

class Solution:
    def zigzagLevelOrder(self, root):
        res = []
        if not root:
            return res

        queue = deque([root])
        left_to_right = True

        while queue:
            size = len(queue)
            level = [0] * size

            for i in range(size):
                node = queue.popleft()

                index = i if left_to_right else size - 1 - i
                level[index] = node.val

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            res.append(level)
            left_to_right = not left_to_right

        return res
