/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //dp[i] = least cost to get to step i
        //dp[i] = min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2])
        //dp[0] = dp[1] = 0
        int fir = 0;
        int sec = 0;
        for (int i = 2; i <= cost.length; i++) {
            int tmp = sec;
            sec = Math.min(fir + cost[i - 2], sec + cost[i - 1]);
            fir = tmp;
        }
        return sec; 
    }
}
// @lc code=end

