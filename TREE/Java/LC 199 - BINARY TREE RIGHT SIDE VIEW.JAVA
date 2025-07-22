// LEETCODE 199 - BINARY TREE RIGHT SIDE VIEW
// QUESTION LINK - "https://leetcode.com/problems/binary-tree-right-side-view/"

import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);

        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = Q.poll();
                if (i == size - 1) res.add(curr.val);  // rightmost node

                if (curr.left != null) Q.offer(curr.left);
                if (curr.right != null) Q.offer(curr.right);
            }
        }
        return res;
    }
}
