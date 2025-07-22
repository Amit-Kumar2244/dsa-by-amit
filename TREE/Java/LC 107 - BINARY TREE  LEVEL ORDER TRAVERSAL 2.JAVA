// LEETCODE 107 - BINARY TREE LEVEL ORDER TRAVERSAL II
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-level-order-traversal-ii/"

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            res.add(0, level); // Add at beginning for reverse order
        }

        return res;
    }
}
