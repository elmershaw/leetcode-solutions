/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        //dp[i][0] means max amount of cash in day i with stack holding
        //dp[i][1] means max amount of cash in day i wihtout stack holding
        //dp[i][0] = max(dp[i - 1][0], - prices[i])
        //dp[i][1] = max(dp[i - 1][1], dp[i - 1][0] + prices[i])
        //dp[0][0] = -prices[0]
        //dp[0][1] = 0
        // DP algorithm
        //int[][] dp = new int[prices.length][2];
        //dp[0][0] = -prices[0];
        //dp[0][1] = 0;
        int preHold = -prices[0];
        int preNoHold = 0;
        int hold = 0;
        int noHold = 0;
        for (int i = 1; i < prices.length; i++) {
            hold = Math.max(preHold, - prices[i]);
            noHold = Math.max(preNoHold, preHold + prices[i]);
            preHold = hold;
            preNoHold = noHold;
        }
        return noHold;
        // greedy algorithm
        // int l = prices[0], r = prices[0];
        // int profit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < l) {
        //         l = prices[i];
        //         r = prices[i];
        //     }
        //     if (prices[i] > r) {
        //         profit = Math.max(profit, prices[i] - l);
        //         r = prices[i];
        //     }
        // }
        // return profit;
    }
}
// @lc code=end

