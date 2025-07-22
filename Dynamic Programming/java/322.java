class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int m = amount;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= m; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    int remain = j - coins[i - 1];
                    if (dp[i][remain] != Integer.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][remain]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        if (dp[n][m] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[n][m];
    }
}