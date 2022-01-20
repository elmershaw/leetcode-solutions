/*
 * @lc app=leetcode.cn id=1872 lang=java
 *
 * [1872] 石子游戏 VIII
 */

// @lc code=start
class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        for (int i = 1; i < n; i++) {
            stones[i] += stones[i - 1];
        }
        int ans = stones[n - 1];
        for (int j = n - 2; j > 0; j--) {
            ans = Math.max(ans, stones[j] - ans);
        }
        return ans;
    }
}
// @lc code=end

