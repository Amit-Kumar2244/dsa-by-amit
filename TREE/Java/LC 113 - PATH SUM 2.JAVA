// LEETCODE 113 - PATH SUM II
// QUESTION LINK - "https://leetcode.com/problems/path-sum-ii/"

import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, 0, targetSum, path, res);
        return res;
    }

    private void dfs(TreeNode node, int sum, int targetSum,
                     List<Integer> path, List<List<Integer>> res) {
        if (node == null) return;

        sum += node.val;
        path.add(node.val);

        if (node.left == null && node.right == null) {
            if (sum == targetSum) res.add(new ArrayList<>(path));
        } else {
            dfs(node.left, sum, targetSum, path, res);
            dfs(node.right, sum, targetSum, path, res);
        }

        path.remove(path.size() - 1);
    }
}
