// GFG - Print Linked List
// QUESTION LINK - https://www.geeksforgeeks.org/problems/print-linked-list-elements/1

void printList(Node *head) {
    // your code goes here
    Node* temp = head;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
}
