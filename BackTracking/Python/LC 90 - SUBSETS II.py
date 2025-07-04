# LEET CODE 90 - SUBSETS II
# QUESTION LINK - https://leetcode.com/problems/subsets-ii/

class Solution:
    def handleDup(self, nums, res, start, temp):
        res.append(temp[:])

        for i in range(start, len(nums)):
            if i > start and nums[i] == nums[i - 1]:
                continue
            temp.append(nums[i])
            self.handleDup(nums, res, i + 1, temp)
            temp.pop()

    def subsetsWithDup(self, nums):
        nums.sort()
        res = []
        self.handleDup(nums, res, 0, [])
        return res
