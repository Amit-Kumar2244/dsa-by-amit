# LEET CODE 160 - Intersection of Two Linked Lists
# QUESTION LINK - https://leetcode.com/problems/intersection-of-two-linked-lists/

class Solution:
    def getIntersectionNode(self, headA: Optional[ListNode], headB: Optional[ListNode]) -> Optional[ListNode]:
        if headA is None or headB is None:
            return None

        temp = headA
        temp2 = headB

        # Traverse both lists, switch heads when reaching the end
        while temp != temp2:
            temp = headB if temp is None else temp.next
            temp2 = headA if temp2 is None else temp2.next

        return temp  # This is either the intersection node or None
