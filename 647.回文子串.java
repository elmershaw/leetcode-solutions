/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        //dp[i][j]
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int ans = n;
        for (int i = n - 2; i >=0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (i == j - 1 || dp[i + 1][j - 1])){
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

