// LEET CODE 21 - MERGE TWO SORTED LISTS
// QUESTION LINK - https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if (list1 == null && list2 == null) return null;
        else if (list1 == null) return list2;
        else if (list2 == null) return list1;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (list1 != null && list2 != null)
        {
            if (list1.val <= list2.val)
            {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else
            {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        if (list1 == null)
        {
            temp.next = list2;
        }
        else
        {
            temp.next = list1;
        }

        return dummy.next;
    }
}
