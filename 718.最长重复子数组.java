/*
 * @lc app=leetcode.cn id=718 lang=java
 *
 * [718] 最长重复子数组
 */

// @lc code=start
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        // dp[i][j] = longest sub-array till nums1[i] ans nums2[j]
        // dp[i][j] = dp[i - 1][j - 1] + 1 (if nums1[i] == nums2[j])
        // dp[i][j] = 
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m][n];
        // dp[0][0] = nums1[0] == nums2[0] ? 1 : 0;
        // for (int i = 0; i < m; i++) {
        //     dp[i][0] = 
        // }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                else if (i != 0 && j != 0) {
                    if(nums1[i] == nums2[j])
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
                else {
                    if (nums1[i] == nums2[j])
                        dp[i][j] = 1;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

