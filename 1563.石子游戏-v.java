import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1563 lang=java
 *
 * [1563] 石子游戏 V
 */

// @lc code=start
class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[][] dp = new int[n][n];
        int[] prefix = new int[n];
        prefix[0] = stoneValue[0];
        for (int i = 1; i < n; i++) {
            prefix[i] += stoneValue[i] + prefix[i - 1];
        }
        for (int l = 2; l <= n; l++) {
            for (int j = 0; j + l - 1 < n; j++) {
                int m = j + l - 1;
                for (int k = j; k <= m; k++) {
                    if (j > k || k + 1 > m) {
                        continue;
                    }
                    int left = dp[j][k];
                    int right = dp[k + 1][m];
                    int ls = prefix[k] - (j > 0 ? prefix[j - 1] : 0);
                    int rs = prefix[m] - prefix[k];
                    if (ls == rs) {
                        int temp = ls + Math.max(left, right);
                        dp[j][m] = Math.max(dp[j][m], temp);
                        continue;
                    }

                    if (ls > rs) {
                        int temp = rs + right;
                        dp[j][m] = Math.max(dp[j][m], temp);
                    } else {
                        int temp = ls + left;
                        dp[j][m] = Math.max(dp[j][m], temp);
                    }
                }
            }
        } 
        return dp[0][n - 1];
        
    }
}
// @lc code=end

