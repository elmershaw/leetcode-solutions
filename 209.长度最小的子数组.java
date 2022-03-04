/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i - l);
                sum -= nums[l++];
            }
        }
        return l == 0 ? 0 : ans + 1;
    }
}
// @lc code=end

