# LEETCODE 230 - KTH SMALLEST ELEMENT IN A BST
# QUESTION LINK - "https://leetcode.com/problems/kth-smallest-element-in-a-bst/"

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        def inorder(node):
            if not node:
                return []
            return inorder(node.left) + [node.val] + inorder(node.right)

        res = inorder(root)
        return res[k - 1]
