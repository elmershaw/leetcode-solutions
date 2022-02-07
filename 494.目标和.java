/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
  public int findTargetSumWays(int[] nums, int target) {
    // !!! left - right = target -> left - (sum - left) = target
    // !!! -> left = (sum + target) / 2
    // dp[i] = expression number that aggregate of i
    // dp[i] = dp[i - nums[j]] + dp[i + nums[j]]
    // int[] dp = new int[sum]
    int sum = Arrays.stream(nums).sum();
    if (Math.abs(target) > sum) return 0;
    if ((target + sum) % 2 != 0)
      return 0;
    int size = (target + sum) >> 1;
    // if (size < 0)
    //   size = -size;
    int[] dp = new int[size + 1];
    dp[0] = 1;
    for (int i = 0; i < nums.length; i++) {
      for (int j = size; j >= nums[i]; j--) {
        dp[j] += dp[j - nums[i]];
      }
    }
    return dp[size];
  }
}
// @lc code=end
