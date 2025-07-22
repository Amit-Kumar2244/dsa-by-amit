// HACKERRANK -  LEVEL ORDER TRAVERSAL
// QUESTION LINK - "https://www.hackerrank.com/challenges/tree-level-order-traversal/problem"

static void levelOrder(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        System.out.print(current.data + " ");

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
}
