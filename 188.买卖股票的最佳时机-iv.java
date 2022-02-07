/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k, int[] prices) {
        // dp[i][m] = max profit m+1th time holding stock, m % 2 == 0
        // dp[i][m + 1] = max profit m+1th time no holding stock
        int n = prices.length;
        int[][] dp = new int[n][k << 1];
        for (int i = 0; i < k << 1; i += 2) {
            dp[0][i] = -prices[0];
        }
        for (int i = 1; i < n; i++) {
            dp[]
            for (int j = 0; j < k << 1; j += 2) {
                if (j)
                dp[i][j] = 
            }
        }
    }
}
// @lc code=end

