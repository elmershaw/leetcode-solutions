/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        // dp[i][j] = ways to get to point(i, j)
        // dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        // dp[i][0] = 0, dp[0][j] = 0, dp[1][1] = 1

        // two dimensions
        // int[][] dp = new int[m + 1][n + 1];
        // dp[1][1] = 1;
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 && j == 1) continue;
        //         dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        //     }
        // }
        // return dp[m][n];

        // one dimension
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) continue;
                dp[j] += dp[j - 1];
            }
        }
        return dp[n];
    }
}
// @lc code=end

