import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        //dp[i] means least numbers of xxx could add up to i
        //dp[i] = min(dp[i], dp[i - j * j] + 1)
        //dp[0] = 0
        int[] dp = new int[n + 1];
        int max = (int) Math.sqrt(n);
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= max; i++) {
            for (int j = i * i; j <= n; j++) {
                if (dp[j - i * i] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
                }
            }
        }
        return dp[n];
    }
}
// @lc code=end

