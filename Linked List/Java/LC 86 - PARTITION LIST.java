// LEET CODE 86 - PARTITION LIST
// QUESTION LINK - https://leetcode.com/problems/partition-list/

class Solution {
    public ListNode partition(ListNode HEAD, int X) {
        if (HEAD == null) return null;

        ListNode GREATHEAD = null;
        ListNode SMALLHEAD = null;
        ListNode GREATCUR = null;
        ListNode SMALLCUR = null;
        ListNode TEMP = HEAD;

        while (TEMP != null) {
            if (TEMP.val < X) {
                if (SMALLHEAD == null) {
                    SMALLHEAD = TEMP;
                    SMALLCUR = TEMP;
                } else {
                    SMALLCUR.next = TEMP;
                    SMALLCUR = SMALLCUR.next;
                }
            } else {
                if (GREATHEAD == null) {
                    GREATHEAD = TEMP;
                    GREATCUR = TEMP;
                } else {
                    GREATCUR.next = TEMP;
                    GREATCUR = GREATCUR.next;
                }
            }
            TEMP = TEMP.next;
        }

        if (GREATCUR != null) GREATCUR.next = null;
        if (SMALLCUR == null) return GREATHEAD;

        SMALLCUR.next = GREATHEAD;
        return SMALLHEAD;
    }
}
