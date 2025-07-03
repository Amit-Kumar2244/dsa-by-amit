# GFG - Linked List Length Even or Odd
# QUESTION LINK - https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1

class Solution:
    def isLengthEvenOrOdd(self, head):
        count = 0
        temp = head
        while temp:
            count += 1
            temp = temp.next
        return "Even" if count % 2 == 0 else "Odd"
