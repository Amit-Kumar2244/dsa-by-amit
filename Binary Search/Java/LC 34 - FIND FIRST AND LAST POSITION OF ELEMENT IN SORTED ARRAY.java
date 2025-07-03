// LEET CODE 34 - Find First and Last Position of Element in Sorted Array
// QUESTION LINK - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int firstOccurrence(int[] nums, int target) {
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int lastOccurrence(int[] nums, int target) {
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstOccurrence(nums, target);
        result[1] = lastOccurrence(nums, target);
        return result;
    }
}
