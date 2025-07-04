# LEET CODE 21 - MERGE TWO SORTED LISTS
# QUESTION LINK - https://leetcode.com/problems/merge-two-sorted-lists/

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if list1 is None and list2 is None:
            return None
        elif list1 is None:
            return list2
        elif list2 is None:
            return list1

        dummy = ListNode(0)
        temp = dummy

        while list1 is not None and list2 is not None:
            if list1.val <= list2.val:
                temp.next = list1
                temp = temp.next
                list1 = list1.next
            else:
                temp.next = list2
                temp = temp.next
                list2 = list2.next

        if list1 is None:
            temp.next = list2
        else:
            temp.next = list1

        return dummy.next
