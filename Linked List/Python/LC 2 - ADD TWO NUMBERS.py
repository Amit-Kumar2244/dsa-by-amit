# LEET CODE 2 - ADD TWO NUMBERS
# QUESTION LINK - https://leetcode.com/problems/add-two-numbers/

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ans = ListNode(0)
        temp = ans

        carry = 0
        while l1 is not None or l2 is not None or carry != 0:
            sum = 0
            if l1 is not None:
                sum += l1.val
                l1 = l1.next
            if l2 is not None:
                sum += l2.val
                l2 = l2.next
            sum += carry
            amit = ListNode(sum % 10)
            carry = sum // 10
            temp.next = amit
            temp = temp.next

        return ans.next
