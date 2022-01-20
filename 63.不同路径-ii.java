/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // dp[i][j] = ways to get to point(i, j)
        // if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
        // else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        // int[][] dp = int[m + 1][n + 1];
        // dp[1][1] = 1;

        // two dimensions
        // int m = obstacleGrid.length;
        // int n = obstacleGrid[0].length;
        // int[][] dp = new int[m + 1][n + 1];
        // if (obstacleGrid[0][0] == 1) return 0;
        // else dp[1][1] = 1;
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 && j == 1) continue;
        //         if (obstacleGrid[i - 1][j - 1] == 1) dp[i][j] = 0;
        //         else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        //     }
        // }
        // return dp[m][n];

        // one dimension
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n + 1];
        if (obstacleGrid[0][0] == 1) return 0;
        dp[1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j<= n; j++) {
                if (i == 1 && j == 1) continue;
                if (obstacleGrid[i - 1][j - 1] == 1) dp[j] = 0;
                else dp[j] += dp[j - 1];
            }
        }
        return dp[n];
    }
}
// @lc code=end

