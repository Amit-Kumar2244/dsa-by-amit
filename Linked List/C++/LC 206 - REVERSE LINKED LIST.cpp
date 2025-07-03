// LEET CODE 206 - Reverse Linked List
// QUESTION LINK - https://leetcode.com/problems/reverse-linked-list/

class Solution {
public:
    ListNode* reverseList(ListNode* head)
    {
        ListNode* cur = head;
        ListNode* prev = NULL;
        ListNode* next = NULL;

        // Reverse the pointers
        while (cur != NULL)
        {
            next = cur->next;
            cur->next = prev;
            prev = cur;
            cur = next;
        }

        return prev; // New head of reversed list
    }
};
