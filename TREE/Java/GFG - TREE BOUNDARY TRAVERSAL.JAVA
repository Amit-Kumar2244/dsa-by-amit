// GFG - TREE BOUNDARY TRAVERSAL
// QUESTION LINK - "https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1"

class Solution {
    boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    void addLeftBoundary(Node node, List<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) res.add(node.data);
            if (node.left != null)
                node = node.left;
            else
                node = node.right;
        }
    }

    void addLeaves(Node node, List<Integer> res) {
        if (node == null) return;
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }

    void addRightBoundary(Node node, List<Integer> res) {
        List<Integer> temp = new ArrayList<>();
        while (node != null) {
            if (!isLeaf(node)) temp.add(node.data);
            if (node.right != null)
                node = node.right;
            else
                node = node.left;
        }
        Collections.reverse(temp);
        res.addAll(temp);
    }

    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (!isLeaf(root)) res.add(root.data);
        addLeftBoundary(root.left, res);
        addLeaves(root, res);
        addRightBoundary(root.right, res);

        return res;
    }
}
