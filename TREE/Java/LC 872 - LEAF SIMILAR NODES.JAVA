// LEETCODE 872 - LEAF-SIMILAR TREES
// QUESTION LINK - "https://leetcode.com/problems/leaf-similar-trees/"

import java.util.*;

class Solution {
    private void getLeafSequence(TreeNode root, List<Integer> leaves) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }
        getLeafSequence(root.left, leaves);
        getLeafSequence(root.right, leaves);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        getLeafSequence(root1, leaf1);
        getLeafSequence(root2, leaf2);
        return leaf1.equals(leaf2);
    }
}
