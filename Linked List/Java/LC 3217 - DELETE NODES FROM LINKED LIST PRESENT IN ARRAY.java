// LEET CODE 3217 - DELETE NODES FROM LINKED LIST PRESENT IN ARRAY
// QUESTION LINK - https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = null;
        ListNode prev = null;
        HashMap<Integer, Integer> record = new HashMap<>();

        // Store all elements from nums[] in a hashmap for quick lookup
        for (int i = 0; i < nums.length; i++) {
            record.put(nums[i], 0);
        }

        temp = head;
        while (temp != null) {
            if (record.containsKey(temp.val)) {
                if (temp == head) {
                    head = head.next;  // Move head if first node needs deletion
                    temp = head;
                    continue;
                } else {
                    prev.next = temp.next;  // Remove current node from list
                    temp = temp.next;
                    continue;
                }
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
