// LEET CODE 142 - Linked List Cycle II
// QUESTION LINK - https://leetcode.com/problems/linked-list-cycle-ii/

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if (head == NULL || head->next == NULL) return NULL;

        ListNode* slow = head;
        ListNode* fast = head;

        while (fast != NULL && fast->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;

            if (slow == fast) {
                ListNode* temp = head;
                while (temp != slow) {
                    temp = temp->next;
                    slow = slow->next;
                }
                return slow;
            }
        }

        return NULL;
    }
};
