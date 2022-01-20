/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        //dp[i][0]
        //dp[i][1]
        //dp[i][0] = max(dp[i - 1][0], dp[i - 1][1])
        //dp[i][1] = dp[i - 1][2] + prices[i];
        //dp[i][2] = max(dp[i - 1][0] - prices[i], dp[i - 1][2])
        //dp[0][0] = 0;
        //dp[0][1] = 0;
        //dp[0][2] = -prices[0];
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][2] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][0] - prices[i]);
            // System.out.println(dp[i][0]);
            // System.out.println(dp[i][1]);
            // System.out.println(dp[i][2]);
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
    }
}
// @lc code=end

