/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        //DP
        // int[][] dp = new int[n1 + 1][n2 + 1];
        // for (int i = 1; i <= n1; i++) {
        //     for (int j = i; j <= n2; j++) {
        //         if (s.charAt(i - 1) == t.charAt(j - 1)) {
        //             dp[i][j] = dp[i - 1][j - 1] + 1;
        //         } else {
        //             dp[i][j] = dp[i][j - 1];
        //         }
        //     }
        // }
        // return dp[n1][n2] == s.length();
        if (s.length() == 0) {
            return true;
        }
        int j = 0;
        for (int i = 0; i < n2; i++) {
            if (t.charAt(i) == s.charAt(j)) {
                if (++j == n1) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

