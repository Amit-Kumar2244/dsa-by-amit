// LEET CODE 160 - Intersection of Two Linked Lists
// QUESTION LINK - https://leetcode.com/problems/intersection-of-two-linked-lists/

class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == NULL || headB == NULL) return NULL;

        ListNode* temp = headA;
        ListNode* temp2 = headB;

        // Traverse both lists, switch heads when reaching the end
        while (temp != temp2) {
            temp = (temp == NULL) ? headB : temp->next;
            temp2 = (temp2 == NULL) ? headA : temp2->next;
        }

        return temp; // This is either the intersection node or NULL
    }
};
