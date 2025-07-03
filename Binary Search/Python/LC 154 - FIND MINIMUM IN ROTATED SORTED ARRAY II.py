# LEET CODE 154 - Find Minimum in Rotated Sorted Array II
# QUESTION LINK - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

class Solution:
    def findMin(self, nums):
        low, high = 0, len(nums) - 1
        while low < high:
            mid = (low + high) // 2
            if nums[mid] > nums[high]:
                low = mid + 1
            elif nums[low] == nums[mid] == nums[high]:
                low += 1
                high -= 1
            else:
                high = mid
        return nums[low]
