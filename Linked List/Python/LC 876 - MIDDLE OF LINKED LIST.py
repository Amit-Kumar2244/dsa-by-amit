# LEET CODE 876 - Middle of the Linked List
# QUESTION LINK - https://leetcode.com/problems/middle-of-the-linked-list/

class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

        return slow
