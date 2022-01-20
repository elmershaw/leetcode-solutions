/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
<<<<<<< HEAD
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
=======
        //int[] dp = new int[n + 1];
        if (n == 0) {
            return 0;
        }
        int p1 = 0;
        int p2 = 1;
        int tmp = 0;
        for (int i = 2; i <= n; i++) {
            tmp = p2;
            p2 += p1;
            p1 = tmp;
        }
        // dp[0] = 0;
        // dp[1] = 1;
        // for (int i = 2; i <= n; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }
        return p2;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

