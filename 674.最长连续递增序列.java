/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        // int[] dp = new int[n];
        // dp[i] = dp[i - 1] + 1 (if nums[i] > nums[i - 1])
        // dp[i] = 1 (else)
        // dp[0] = 1;
        int l = 1;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                // dp[i] = dp[i - 1] + 1;
                l++;
            } else {
                // dp[i] = 1;
                l = 1;
            }
            ans = Math.max(ans, l);
        }
        return ans;
    }
}
// @lc code=end

