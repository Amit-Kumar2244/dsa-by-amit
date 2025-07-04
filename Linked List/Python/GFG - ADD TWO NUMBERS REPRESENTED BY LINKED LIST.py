# GFG - Add Two Numbers Represented by Linked Lists
# QUESTION LINK - https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

class Solution:
    
    def reverseLL(self, head):
        next = None
        temp = head
        prev = None
        while temp is not None:
            next = temp.next
            temp.next = prev
            prev = temp
            temp = next
        return prev

    def addTwoLists(self, num1, num2):
        num1 = self.reverseLL(num1)
        num2 = self.reverseLL(num2)
        ans = Node(0)
        ansCur = ans
        carry = 0

        while num1 is not None or num2 is not None or carry != 0:
            sum = 0
            if num1 is not None:
                sum += num1.data
                num1 = num1.next
            if num2 is not None:
                sum += num2.data
                num2 = num2.next
            sum += carry
            newNode = Node(sum % 10)
            carry = sum // 10
            ansCur.next = newNode
            ansCur = ansCur.next

        ansCur = self.reverseLL(ans.next)

        # Remove leading zeros
        while ansCur is not None and ansCur.data == 0 and ansCur.next is not None:
            ansCur = ansCur.next

        return ansCur
