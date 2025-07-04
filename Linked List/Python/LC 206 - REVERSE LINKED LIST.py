# LEET CODE 206 - Reverse Linked List
# QUESTION LINK - https://leetcode.com/problems/reverse-linked-list/

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        prev = None
        next = None

        # Reverse the pointers
        while cur is not None:
            next = cur.next
            cur.next = prev
            prev = cur
            cur = next

        return prev  # New head of reversed list
