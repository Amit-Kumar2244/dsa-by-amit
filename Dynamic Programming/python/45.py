class Solution:
    def jump(self, nums):
        jump = 0
        maxreached = 0
        reach = 0
        for i in range(len(nums) - 1):
            maxreached = max(maxreached, nums[i] + i)
            if i == reach:
                jump += 1
                reach = maxreached
        return jump