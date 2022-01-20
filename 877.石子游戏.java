import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=877 lang=java
 *
 * [877] 石子游戏
 */

// @lc code=start
class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[] dp = Arrays.copyOf(piles, n);
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                dp[i] = Math.max(piles[i] - dp[i + 1], piles[i + l - 1] - dp[i]);
            }
        }
        return dp[0] > 0;
    }
}
// @lc code=end

