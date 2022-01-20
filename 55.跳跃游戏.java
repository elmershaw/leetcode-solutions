/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {

    public boolean canJump(int[] nums) {
        // int i = 0;
        int n = nums.length;
        int longestStep =nums[0];
        for (int i = 0; i <= longestStep; i++) {
            longestStep = Math.max(longestStep, nums[i] + i);
            if (longestStep >= n - 1) return true;
        }
        return false;
    }
}
// @lc code=end
