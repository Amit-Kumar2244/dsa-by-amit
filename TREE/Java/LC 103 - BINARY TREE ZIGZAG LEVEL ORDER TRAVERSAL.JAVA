// LEETCODE 103 - BINARY TREE ZIGZAG LEVEL ORDER TRAVERSAL
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/"

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer[] level = new Integer[size];

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                int index = leftToRight ? i : size - 1 - i;
                level[index] = node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            res.add(Arrays.asList(level));
            leftToRight = !leftToRight;
        }

        return res;
    }
}
