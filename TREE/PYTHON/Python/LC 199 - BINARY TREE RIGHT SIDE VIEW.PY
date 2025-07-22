# LEETCODE 199 - BINARY TREE RIGHT SIDE VIEW
# QUESTION LINK - "https://leetcode.com/problems/binary-tree-right-side-view/"

from collections import deque

class Solution:
    def rightSideView(self, root):
        res = []
        if not root:
            return res

        queue = deque([root])

        while queue:
            size = len(queue)
            for i in range(size):
                node = queue.popleft()
                if i == size - 1:
                    res.append(node.val)

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
        return res
