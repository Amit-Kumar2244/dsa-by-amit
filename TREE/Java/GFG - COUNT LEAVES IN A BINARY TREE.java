// GFG - COUNT LEAVES IN BINARY TREE
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1"

class Solution {
    private void countLeafUtil(Node root, int[] count) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            count[0]++;
        }
        countLeafUtil(root.left, count);
        countLeafUtil(root.right, count);
    }

    int countLeaves(Node root) {
        int[] count = new int[1];
        countLeafUtil(root, count);
        return count[0];
    }
}
