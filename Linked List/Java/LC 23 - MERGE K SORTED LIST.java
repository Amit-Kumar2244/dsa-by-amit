// LEET CODE 23 - MERGE K SORTED LISTS
// QUESTION LINK - https://leetcode.com/problems/merge-k-sorted-lists/

class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }

        if (l1 == null)
        {
            temp.next = l2;
        }
        else
        {
            temp.next = l1;
        }

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        for (int i = 0; i < lists.length; i++)
        {
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }
}
