import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=132 lang=java
 *
 * [132] 分割回文串 II
 */

// @lc code=start
class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPLD = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || isPLD[i + 1][j - 1])) {
                    isPLD[i][j] = true;
                }
            }
        }
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = i;
        // dp[0] = 0;
        for (int i = 1; i < n; i++) {
            if (isPLD[0][i]) {
                dp[i] = 0;
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (isPLD[j + 1][i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
            // System.out.println(dp[i]);
        }
        return dp[n - 1];
    }
}
// @lc code=end

