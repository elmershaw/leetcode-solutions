import java.util.Arrays;


/*
 * @lc app=leetcode.cn id=1406 lang=java
 *
 * [1406] 石子游戏 III
 */

// @lc code=start
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        dp[n - 1] = stoneValue[n - 1];
        int sum = dp[n - 1];
        if (n - 2 >= 0) {
            sum += stoneValue[n - 2];
            dp[n - 2] = sum - Math.min(dp[n], dp[n - 1]);
        }
        for (int i = n - 3; i >= 0; i--) {
            sum += stoneValue[i];
            dp[i] = sum - Math.min(dp[i + 1], Math.min(dp[i + 2], dp[i + 3]));
        }
        if (dp[0] * 2 > sum) {
            return "Alice";
        } else if (dp[0] * 2 == sum) {
            return "Tie";
        } else {
            return "Bob";
        }
    }
}
// @lc code=end

