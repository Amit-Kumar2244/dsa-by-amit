// LEET CODE 61 - Rotate List
// QUESTION LINK - https://leetcode.com/problems/rotate-list/

class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (head == NULL) return NULL;

        ListNode* temp = head;
        int size = 0;

        // Count the size of the list
        while (temp != NULL) {
            size++;
            temp = temp->next;
        }

        k %= size;
        if (k == 0) return head;

        ListNode* slow = head;
        ListNode* fast = head;

        // Move fast pointer k steps ahead
        while (k--) {
            fast = fast->next;
        }

        // Move both pointers until fast reaches the end
        while (fast->next != NULL) {
            slow = slow->next;
            fast = fast->next;
        }

        // Perform the rotation
        fast->next = head;
        head = slow->next;
        slow->next = NULL;

        return head;
    }
};
