# LEET CODE 33 - Search in Rotated Sorted Array
# QUESTION LINK - https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution:
    def search(self, nums, target):
        low, high = 0, len(nums) - 1
        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                return mid
            if nums[low] <= nums[mid]:
                if nums[low] <= target <= nums[mid]:
                    high = mid - 1
                else:
                    low = mid + 1
            elif nums[mid] <= nums[high]:
                if nums[mid] <= target <= nums[high]:
                    low = mid + 1
                else:
                    high = mid - 1
        return -1
