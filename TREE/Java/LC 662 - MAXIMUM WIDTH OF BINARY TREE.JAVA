// LeetCode 662 - Maximum Width of Binary Tree
// https://leetcode.com/problems/maximum-width-of-binary-tree/

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        long result = 0;
        Queue<Pair<TreeNode, Long>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 1L));
        while (!queue.isEmpty()) {
            int sz = queue.size();
            long left = queue.peek().getValue(), right = left;
            for (int i = 0; i < sz; i++) {
                Pair<TreeNode, Long> p = queue.poll();
                TreeNode node = p.getKey(); long idx = p.getValue();
                right = idx;
                if (node.left != null) queue.add(new Pair<>(node.left, idx * 2));
                if (node.right != null) queue.add(new Pair<>(node.right, idx * 2 + 1));
            }
            result = Math.max(result, right - left + 1);
        }
        return (int) result;
    }
}
