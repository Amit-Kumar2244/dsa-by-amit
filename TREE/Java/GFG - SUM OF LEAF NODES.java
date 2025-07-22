// GFG - SUM OF LEAF NODES
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes/1"

class Solution {
    private void leafSumUtil(Node root, int[] sum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            sum[0] += root.data;
        }
        leafSumUtil(root.left, sum);
        leafSumUtil(root.right, sum);
    }

    int leafSum(Node root) {
        int[] sum = new int[1];
        leafSumUtil(root, sum);
        return sum[0];
    }
}
