# LEET CODE 86 - PARTITION LIST
# QUESTION LINK - https://leetcode.com/problems/partition-list/

class Solution:
    def partition(self, HEAD: Optional[ListNode], X: int) -> Optional[ListNode]:
        if HEAD is None:
            return None

        GREATHEAD = None
        SMALLHEAD = None
        GREATCUR = None
        SMALLCUR = None
        TEMP = HEAD

        while TEMP is not None:
            if TEMP.val < X:
                if SMALLHEAD is None:
                    SMALLHEAD = TEMP
                    SMALLCUR = TEMP
                else:
                    SMALLCUR.next = TEMP
                    SMALLCUR = SMALLCUR.next
            else:
                if GREATHEAD is None:
                    GREATHEAD = TEMP
                    GREATCUR = TEMP
                else:
                    GREATCUR.next = TEMP
                    GREATCUR = GREATCUR.next
            TEMP = TEMP.next

        if GREATCUR is not None:
            GREATCUR.next = None
        if SMALLCUR is None:
            return GREATHEAD

        SMALLCUR.next = GREATHEAD
        return SMALLHEAD
