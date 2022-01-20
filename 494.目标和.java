/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if ((target + sum) % 2 == 1 || Math.abs(target) > sum) return 0;
        int pos = (sum + target) >> 1;
        int[] dp = new int[pos + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = pos; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[pos];
    }
}
// @lc code=end

