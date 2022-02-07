/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        // dp[i][j] = s.sub(0, i - 1) is a subsequence of t.sub(0, j - 1) 
        // if s[i] == t[j]
        // dp[i][j] = dp[i - 1][j - 1]
        // else
        // dp[i][j] = dp[i][j - 1]
        for (int j = 0; j <=n ; j++) {
            dp[0][j] = true;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end

