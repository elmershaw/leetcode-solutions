/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        // greedy
        // if (n == 2) return 1;
        // if (n == 3) return 2;
        // int three = n / 3;
        // if (n % 3 == 1) {
        //     return (int)Math.pow(3, three - 1) * 4;
        // } else if (n % 3 == 0) {
        //     return (int) Math.pow(3, three);
        // } else {
        //     return (int) Math.pow(3, three) * 2;
        // }

        if (n == 2) return 1;
        int[] dp = new int[n + 1];
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] * 2, dp[i - 3] * 3);
        }
        return dp[n];
    }
}
// @lc code=end

