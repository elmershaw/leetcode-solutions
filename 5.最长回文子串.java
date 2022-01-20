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
        int ans = 1;
        int l = 0;
        int r = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - 1 < i + 1 || dp[i + 1][j - 1]) {
                        if (j - i + 1 > ans) {
                            ans = j - i + 1;
                            l = i;
                            r = j;
                        }
                        dp[i][j] = true;
                    }
                }
            }
        }
        return s.substring(l, r + 1);
    }
}
// @lc code=end

