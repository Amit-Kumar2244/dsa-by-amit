// LEET CODE 61 - Rotate List
// QUESTION LINK - https://leetcode.com/problems/rotate-list/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        ListNode temp = head;
        int size = 0;

        // Count the size of the list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        k %= size;
        if (k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer k steps ahead
        while (k-- > 0) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Perform the rotation
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
