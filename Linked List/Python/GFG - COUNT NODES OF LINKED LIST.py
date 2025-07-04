# GFG - Count nodes of linked list
# QUESTION LINK - https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

class Solution:
    def getCount(self, head):
        temp = head
        count = 0
        while temp:
            count += 1
            temp = temp.next
        return count
