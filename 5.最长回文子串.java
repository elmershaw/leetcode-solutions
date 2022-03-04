/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        // dp[i][j] means the substring of s from i to j is a palindrome or not
        // dp[i][j] = dp[i + 1][j - 1] & s[i][j]
        // dp[i][0] = false
        // dp[s.length() - 1][j] = false
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int l = 0;
        int r = 0;
        int maxL = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > maxL) {
                        l = i;
                        r = j;
                        maxL = j - i + 1;
                    }
                }
            }
        }
        return s.substring(l, r + 1);
    }
}
// @lc code=end

