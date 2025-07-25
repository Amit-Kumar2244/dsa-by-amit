// LEET CODE 2 - ADD TWO NUMBERS
// QUESTION LINK - https://leetcode.com/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;

            ListNode amit = new ListNode(sum % 10);
            carry = sum / 10;
            temp.next = amit;
            temp = temp.next;
        }

        return ans.next;
    }
}
