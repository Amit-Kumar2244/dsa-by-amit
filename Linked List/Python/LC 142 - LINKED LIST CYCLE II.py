# LEET CODE 142 - Linked List Cycle II
# QUESTION LINK - https://leetcode.com/problems/linked-list-cycle-ii/

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None

        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                temp = head
                while temp != slow:
                    temp = temp.next
                    slow = slow.next
                return slow

        return None
