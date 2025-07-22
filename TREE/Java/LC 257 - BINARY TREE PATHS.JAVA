// LEETCODE 257 - BINARY TREE PATHS
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-paths/"

import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        buildPaths(root, "", result);
        return result;
    }

    private void buildPaths(TreeNode node, String path, List<String> res) {
        if (node == null) return;

        if (path.isEmpty()) path += node.val;
        else path += "->" + node.val;

        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }

        buildPaths(node.left, path, res);
        buildPaths(node.right, path, res);
    }
}
