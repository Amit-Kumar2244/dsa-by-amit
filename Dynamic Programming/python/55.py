class Solution:
    def canJump(self, nums):
        reach = len(nums) - 1
        for i in range(reach, -1, -1):
            if nums[i] + i >= reach:
                reach = i
        return reach == 0