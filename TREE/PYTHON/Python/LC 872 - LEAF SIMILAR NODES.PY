# LEETCODE 872 - LEAF-SIMILAR TREES
# QUESTION LINK - "https://leetcode.com/problems/leaf-similar-trees/"

class Solution:
    def getLeaves(self, root, leaves):
        if not root:
            return
        if not root.left and not root.right:
            leaves.append(root.val)
        self.getLeaves(root.left, leaves)
        self.getLeaves(root.right, leaves)

    def leafSimilar(self, root1, root2):
        leaves1, leaves2 = [], []
        self.getLeaves(root1, leaves1)
        self.getLeaves(root2, leaves2)
        return leaves1 == leaves2
