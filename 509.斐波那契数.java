/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        //dp[i] = f(n)
        //dp[i] = dp[i - 1] + dp[i - 2]
        //dp[0] = 0, dp[1] = 1
        if (n == 0) return 0;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = second;
            second += first;
            first = tmp;
        }
        return second;
    }
}
// @lc code=end

