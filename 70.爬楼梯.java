/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
<<<<<<< HEAD
        //dp[i] = ways to get to step i
        //dp[i] = dp[i - 1] + dp[i - 2]
        //dp[0] = 1, dp[1] = 1
        // if (n == 0) return 0;
        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = second;
            second += first;
            first = tmp;
        }
        return second;
=======
        int[] dp = new int[n + 1];
        if (n == 0) {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

