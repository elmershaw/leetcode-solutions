/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
<<<<<<< HEAD
        int profit = 0;
        // int tmp = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                profit += prices[i - 1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        if (prices[prices.length - 1] > buyPrice) profit += prices[prices.length - 1] - buyPrice;
        return profit;
    }
}
// @lc code=end

=======
        int profits = 0;
        int l = 0;
        int tmp = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                tmp = prices[i] - prices[l];
            } else {
                profits += tmp;
                l = i;
                tmp = 0;
            }
        }
        return profits + tmp;
    }
}
// @lc code=end
>>>>>>> cb5f86a (add solutions from home PC)
