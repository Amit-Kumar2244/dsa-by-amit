class Solution:
    def canPartition(self, nums):
        n = len(nums)
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        m = total_sum // 2
        dp = [[0] * (m + 1) for _ in range(n + 1)]
        for i in range(n + 1):
            dp[i][0] = 1
        for i in range(1, n + 1):
            for j in range(m + 1):
                if nums[i - 1] > j:
                    dp[i][j] = dp[i - 1][j]
                else:
                    ans = j - nums[i - 1]
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][ans]
        return dp[n][m] > 0