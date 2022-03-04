/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        // dp[i] = 
        int n = nums.length;
        if (0 == n) return 0;
        // int[] dp = new int[n];
        int prev = 0;
        int cur = 0;
        // dp[0] = nums[0];
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (prev > 0) {
                cur = prev + nums[i];
            } else {
                cur = nums[i];
            }
            ans = Math.max(ans, cur);
            prev = cur;
        }
        return ans;
    }
}
// @lc code=end

