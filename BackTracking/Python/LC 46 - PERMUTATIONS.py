# LEET CODE 46 - PERMUTATIONS
# QUESTION LINK - https://leetcode.com/problems/permutations/

class Solution:
    def equalSubset(self, nums, res, temp):
        if len(temp) == len(nums):
            res.append(temp[:])
            return

        for i in range(len(nums)):
            if nums[i] in temp:
                continue
            temp.append(nums[i])
            self.equalSubset(nums, res, temp)
            temp.pop()

    def permute(self, nums):
        res = []
        self.equalSubset(nums, res, [])
        return res
