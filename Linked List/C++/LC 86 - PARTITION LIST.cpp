// LEET CODE 86 - PARTITION LIST
// QUESTION LINK - https://leetcode.com/problems/partition-list/

class Solution {
public:
    ListNode* partition(ListNode* HEAD, int X) {
        if (HEAD == NULL) return NULL;

        ListNode* GREATHEAD = NULL;
        ListNode* SMALLHEAD = NULL;
        ListNode* GREATCUR = NULL;
        ListNode* SMALLCUR = NULL;
        ListNode* TEMP = HEAD;

        while (TEMP != NULL) {
            if (TEMP->val < X) {
                if (SMALLHEAD == NULL) {
                    SMALLHEAD = TEMP;
                    SMALLCUR = TEMP;
                } else {
                    SMALLCUR->next = TEMP;
                    SMALLCUR = SMALLCUR->next;
                }
            } else {
                if (GREATHEAD == NULL) {
                    GREATHEAD = TEMP;
                    GREATCUR = TEMP;
                } else {
                    GREATCUR->next = TEMP;
                    GREATCUR = GREATCUR->next;
                }
            }
            TEMP = TEMP->next;
        }

        if (GREATCUR != NULL) GREATCUR->next = NULL;
        if (SMALLCUR == NULL) return GREATHEAD;

        SMALLCUR->next = GREATHEAD;
        return SMALLHEAD;
    }
};
