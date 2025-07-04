# LEET CODE 78 - SUBSETS
# QUESTION LINK - https://leetcode.com/problems/subsets/

class Solution:
    def possibleSubsets(self, nums, start, temp, res):
        res.append(temp[:])

        for i in range(start, len(nums)):
            temp.append(nums[i])
            self.possibleSubsets(nums, i + 1, temp, res)
            temp.pop()

    def subsets(self, nums):
        res = []
        self.possibleSubsets(nums, 0, [], res)
        return res
