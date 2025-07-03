// GFG - Count nodes of linked list
// QUESTION LINK - https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

int getCount(struct Node* head) {
    Node* temp = head;
    int count = 0;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}
