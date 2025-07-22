// GFG - SUM OF BINARY TREE
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1"

class Solution {
    void helper(Node root, int[] sum) {
        if (root == null) return;
        sum[0] += root.data;
        helper(root.left, sum);
        helper(root.right, sum);
    }

    int sumBT(Node root) {
        int[] sum = new int[1];
        helper(root, sum);
        return sum[0];
    }
}
