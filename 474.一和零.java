/*
 * @lc app=leetcode.cn id=474 lang=java
 *
 * [474] 一和零
 */

// @lc code=start
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int oneNum, zeroNum;
        for (int i = 0; i < strs.length; i++) {
            // System.out.println(strs[i]);
            // System.out.println(Integer.parseInt(strs[i], 2));
            // System.out.println(Integer.bitCount(Integer.parseInt(strs[i], 2)));
            // int oneNum = Integer.bitCount(Integer.parseInt(strs[i], 2));
            // int zeroNum = strs[i].length() - oneNum;
            oneNum = 0;
            zeroNum = 0;
            for (char ch : strs[i].toCharArray()) {
                if (ch == '0') {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }
            for (int j = m; j >= zeroNum; j--) {
                for (int k = n; k >= oneNum; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeroNum][k - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end

