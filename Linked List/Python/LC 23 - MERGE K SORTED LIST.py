# LEET CODE 23 - MERGE K SORTED LISTS
# QUESTION LINK - https://leetcode.com/problems/merge-k-sorted-lists/

class Solution:
    
    def mergeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        if l1 is None and l2 is None:
            return None
        elif l1 is None:
            return l2
        elif l2 is None:
            return l1

        dummy = ListNode(0)
        temp = dummy

        while l1 is not None and l2 is not None:
            if l1.val <= l2.val:
                temp.next = l1
                l1 = l1.next
                temp = temp.next
            else:
                temp.next = l2
                temp = temp.next
                l2 = l2.next

        if l1 is None:
            temp.next = l2
        else:
            temp.next = l1

        return dummy.next

    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        head = None
        for i in range(len(lists)):
            head = self.mergeTwoLists(head, lists[i])
        return head
