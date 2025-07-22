class Solution:
    def findTargetSumWays(self, nums, target):
        n = len(nums)
        total_sum = sum(nums)
        if target > total_sum or target < -total_sum or (target + total_sum) % 2 != 0:
            return 0
        targetSum = (target + total_sum) // 2
        dp = [[0] * (targetSum + 1) for _ in range(n + 1)]
        for i in range(n + 1):
            dp[i][0] = 1
        for i in range(1, n + 1):
            for j in range(targetSum + 1):
                dp[i][j] = dp[i - 1][j]
                if nums[i - 1] <= j:
                    remain = j - nums[i - 1]
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][remain]
        return dp[n][targetSum]