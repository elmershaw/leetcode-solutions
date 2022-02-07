/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int[][] dp = new int[n][5];
        // dp[0][1] = -prices[0];
        // dp[0][3] = -prices[0];
        int[] states = new int[4];
        states[0] = -prices[0];
        states[2] = -prices[0];
        for (int i = 1; i < n; i++) {
            // dp[i][0] = dp[i - 1][0];
            // dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            // dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            // dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            // dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
            states[3] = Math.max(states[3], states[2] + prices[i]);
            states[2] = Math.max(states[2], states[1] - prices[i]);
            states[1] = Math.max(states[1], states[0] + prices[i]);
            states[0] = Math.max(states[0], -prices[i]);
        }
        return states[3];
    }
}
// @lc code=end

