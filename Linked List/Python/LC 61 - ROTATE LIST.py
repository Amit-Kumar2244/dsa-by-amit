# LEET CODE 61 - Rotate List
# QUESTION LINK - https://leetcode.com/problems/rotate-list/

class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head is None:
            return None

        temp = head
        size = 0

        # Count the size of the list
        while temp is not None:
            size += 1
            temp = temp.next

        k %= size
        if k == 0:
            return head

        slow = head
        fast = head

        # Move fast pointer k steps ahead
        while k > 0:
            fast = fast.next
            k -= 1

        # Move both pointers until fast reaches the end
        while fast.next is not None:
            slow = slow.next
            fast = fast.next

        # Perform the rotation
        fast.next = head
        head = slow.next
        slow.next = None

        return head
