# GFG - Print Linked List
# QUESTION LINK - https://www.geeksforgeeks.org/problems/print-linked-list-elements/1

class Solution:
    def printList(self, head):
        temp = head
        while temp is not None:
            print(temp.data, end=" ")
            temp = temp.next
