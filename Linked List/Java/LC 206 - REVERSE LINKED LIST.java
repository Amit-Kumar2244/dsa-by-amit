// LEET CODE 206 - Reverse Linked List
// QUESTION LINK - https://leetcode.com/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head)
    {
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;

        // Reverse the pointers
        while (cur != null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev; // New head of reversed list
    }
}
