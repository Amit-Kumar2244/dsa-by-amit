// GFG - Count nodes of linked list
// QUESTION LINK - https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

class Solution {
    public int getCount(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
