// LEET CODE 3217 - DELETE NODES FROM LINKED LIST PRESENT IN ARRAY
// QUESTION LINK - https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

class Solution {
public:
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        ListNode* temp = nullptr;
        ListNode* prev = nullptr;
        unordered_map<int, int> record;

        // Store all elements from nums[] in a hashmap for quick lookup
        for (int i = 0; i < nums.size(); i++) {
            record[nums[i]] = 0;
        }

        temp = head;
        while (temp != nullptr) {
            if (record.count(temp->val) != 0) {
                if (temp == head) {
                    head = head->next;  // Move head if first node needs deletion
                    temp = head;
                    continue;
                } else {
                    prev->next = temp->next;  // Remove current node from list
                    temp = temp->next;
                    continue;
                }
            }
            prev = temp;
            temp = temp->next;
        }

        return head;
    }
};
