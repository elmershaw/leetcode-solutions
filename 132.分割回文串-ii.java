import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=132 lang=java
 *
 * [132] 分割回文串 II
 */

// @lc code=start
class Solution {
    public int minCut(String s) {
        // dp + dp
        // one dp stores the answer, another records palindromic sub-string

        int n = s.length();
        boolean[][] isPalindromic = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j < i + 2 || isPalindromic[i + 1][j - 1])) {
                    isPalindromic[i][j] = true;
                }
            }
        }
        //System.out.println(Arrays.toString(isPalindromic[0]));
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            if (isPalindromic[0][i]) {
                dp[i] = 0;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (isPalindromic[j + 1][i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}
// @lc code=end

