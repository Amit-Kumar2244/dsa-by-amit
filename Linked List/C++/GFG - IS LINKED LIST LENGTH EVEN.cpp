// GFG - Linked List Length Even or Odd
// QUESTION LINK - https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1

bool isLengthEven(struct Node **head) {
    Node *temp = *head;
    int count = 0;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return (count % 2 == 0);
}
