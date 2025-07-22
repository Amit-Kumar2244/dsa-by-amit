// HACKERRANK - TREE: LEVEL ORDER TRAVERSAL
// QUESTION LINK - https://www.hackerrank.com/challenges/tree-level-order-traversal/problem

void levelOrder(Node * root) {
    if(root == NULL) return;

    queue<Node*> Q;
    Q.push(root);

    while(!Q.empty()) {
        Node* curr = Q.front();
        Q.pop();

        cout << curr->data << " ";

        if(curr->left != NULL) Q.push(curr->left);
        if(curr->right != NULL) Q.push(curr->right);
    }
}
