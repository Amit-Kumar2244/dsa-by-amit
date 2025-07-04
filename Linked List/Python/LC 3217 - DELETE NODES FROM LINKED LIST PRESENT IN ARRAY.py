# LEET CODE 3217 - DELETE NODES FROM LINKED LIST PRESENT IN ARRAY
# QUESTION LINK - https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        temp = None
        prev = None
        record = {}

        # Store all elements from nums[] in a hashmap for quick lookup
        for num in nums:
            record[num] = 0

        temp = head
        while temp is not None:
            if temp.val in record:
                if temp == head:
                    head = head.next  # Move head if first node needs deletion
                    temp = head
                    continue
                else:
                    prev.next = temp.next  # Remove current node from list
                    temp = temp.next
                    continue
            prev = temp
            temp = temp.next

        return head
