# LEET CODE 34 - Find First and Last Position of Element in Sorted Array
# QUESTION LINK - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution:
    def firstOccurrence(self, nums, target):
        ans = -1
        low, high = 0, len(nums) - 1
        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                ans = mid
                high = mid - 1
            elif nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
        return ans

    def lastOccurrence(self, nums, target):
        ans = -1
        low, high = 0, len(nums) - 1
        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                ans = mid
                low = mid + 1
            elif nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
        return ans

    def searchRange(self, nums, target):
        return [self.firstOccurrence(nums, target), self.lastOccurrence(nums, target)]
