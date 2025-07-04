# LEET CODE 19 - Remove Nth Node From End of List
# QUESTION LINK - https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next is None:
            return None

        fast = head
        slow = head

        while n != 0:
            fast = fast.next
            n -= 1

        if fast is None:
            fast = head
            head = head.next
            return head

        while fast.next is not None:
            slow = slow.next
            fast = fast.next

        fast = slow.next
        slow.next = slow.next.next

        return head
