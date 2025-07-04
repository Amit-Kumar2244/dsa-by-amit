// GFG - Print Linked List
// QUESTION LINK - https://www.geeksforgeeks.org/problems/print-linked-list-elements/1

class Solution {
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
