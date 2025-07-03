// LEET CODE 19 - Remove Nth Node From End of List
// QUESTION LINK - https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head->next == NULL) return NULL;

        ListNode* fast = head;
        ListNode* slow = head;

        while (n != 0) {
            fast = fast->next;
            n--;
        }

        if (fast == NULL) {
            fast = head;
            head = head->next;
            delete fast;
            return head;
        }

        while (fast->next != NULL) {
            slow = slow->next;
            fast = fast->next;
        }

        fast = slow->next;
        slow->next = slow->next->next;
        delete fast;

        return head;
    }
};
