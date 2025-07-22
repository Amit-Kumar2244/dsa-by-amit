class Solution:
    def coinChange(self, coins, amount):
        n = len(coins)
        m = amount
        dp = [[0] * (m + 1) for _ in range(n + 1)]
        for i in range(1, m + 1):
            dp[0][i] = float('inf')
        for i in range(1, n + 1):
            for j in range(1, m + 1):
                if coins[i - 1] > j:
                    dp[i][j] = dp[i - 1][j]
                else:
                    remain = j - coins[i - 1]
                    dp[i][j] = min(dp[i - 1][j], 1 + dp[i][remain])
        if dp[n][m] == float('inf'):
            return -1
        return dp[n][m]