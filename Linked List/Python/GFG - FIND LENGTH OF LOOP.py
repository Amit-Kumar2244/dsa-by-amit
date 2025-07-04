# GFG - Find length of Loop
# QUESTION LINK - https://www.geeksforgeeks.org/problems/find-length-of-loop/1

class Solution:
    def countNodesinLoop(self, head):
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                # Loop detected, count the length
                count = 1
                slow = slow.next
                while slow != fast:
                    count += 1
                    slow = slow.next
                return count

        return 0
