/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            ans = Math.max(count, ans);
            if (count <= 0) {
                count = 0;
            }
        }
        return ans;
    }
}
// @lc code=end

