/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        //int[] dp = new int[nums.length];
        int res = 1;
        // Arrays.fill(dp, 1);
        int dp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp += 1;
            } else {
                dp = 1;
            }

            res = Math.max(res, dp);
        }
        return res;
    }
}
// @lc code=end

