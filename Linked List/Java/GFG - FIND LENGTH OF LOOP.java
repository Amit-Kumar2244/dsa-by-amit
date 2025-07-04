// GFG - Find length of Loop
// QUESTION LINK - https://www.geeksforgeeks.org/problems/find-length-of-loop/1

class Solution {
    int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected, count the length
                int count = 1;
                slow = slow.next;
                while (slow != fast) {
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }

        return 0;
    }
}
