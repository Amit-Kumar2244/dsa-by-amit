// LEET CODE 154 - Find Minimum in Rotated Sorted Array II
// QUESTION LINK - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}
