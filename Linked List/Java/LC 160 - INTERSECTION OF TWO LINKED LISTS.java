// LEET CODE 160 - Intersection of Two Linked Lists
// QUESTION LINK - https://leetcode.com/problems/intersection-of-two-linked-lists/

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode temp = headA;
        ListNode temp2 = headB;

        // Traverse both lists, switch heads when reaching the end
        while (temp != temp2) {
            temp = (temp == null) ? headB : temp.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }

        return temp; // This is either the intersection node or NULL
    }
}
