// GFG - Linked List Length Even or Odd
// QUESTION LINK - https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1

class Solution {
    public boolean isLengthEven(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count % 2 == 0;
    }
}
